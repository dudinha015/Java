/******************************************************************************
39 -  Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida
ela possui. Considere sempre anos completos, e que um ano possui 365 dias. Ex: uma pessoa
com 19 anos possui 6935 dias de vida; veja um exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935
DIAS


 *******************************************************************************/
import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String nome;
        int idade,dias;

        // Entrada de dados
        System.out.println("Entre com o nome desejado: ");
        nome = ler.nextLine();
        
        System.out.println("Entre com a idade: ");
        idade = ler.nextInt();
        
        // Processamento
        dias = idade * 365;
        

        // Saída de dados
        System.out.println(nome + ", você ja viveu " +dias+ " dias");
       
    }
}