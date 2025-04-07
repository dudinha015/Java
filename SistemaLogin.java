/******************************************************************************
8. Desenvolva um programa em Java que simule um sistema de login simples para uma conta corrente. 
O programa deve:Solicitar ao usuário que insira um nome de usuário e senha.
Comparar o nome de usuário e senha inseridos com um nome de usuário e senha predefinidos.
Permitir que o usuário tente fazer login no máximo 3 vezes.Exibir uma mensagem de sucesso
se o login for bem-sucedido ou uma mensagem de erro se o login falhar após 3 tentativas.

*******************************************************************************/
import java.util.Scanner;

public class SistemaLogin {

    public static void main(String[] args) {

        // Entrada de dados
        String usuarioCorreto = "usuario123";
        String senhaCorreta = "senha@123";

        // Scanner para captura de entradas
        Scanner scanner = new Scanner(System.in);

        // Processamento
        String usuarioInserido;
        String senhaInserida;
        int tentativas = 0;
        boolean loginBemSucedido = false;

        // Laço de tentativas de login
        while (tentativas < 3) {

            System.out.print("Digite o nome de usuário: ");
            usuarioInserido = scanner.nextLine();

            System.out.print("Digite a senha: ");
            senhaInserida = scanner.nextLine();

            // Verificando se as credenciais estão corretas
            if (usuarioInserido.equals(usuarioCorreto) && senhaInserida.equals(senhaCorreta)) {
                loginBemSucedido = true;
                break;  // Sai do loop quando o login for bem-sucedido
            } else {
                tentativas++;
                System.out.println("Nome de usuário ou senha incorretos. Tente novamente.");
            }
        }

        // Saída de dados
        if (loginBemSucedido) {
            System.out.println("Login bem-sucedido! Bem-vindo à sua conta corrente.");
        } else {
            System.out.println("Você atingiu o número máximo de tentativas. Acesso bloqueado.");
        }

        
    }
}