/******************************************************************************
29. Escreva um programa que pergunte ao usuário quantos alunos ele
tem em sua academia. Em seguida, através de um laço while, o usuário
digita o peso de todos os alunos, um por vez, e por fim, o programa deve
mostrar a média de peso dos clientes.
*******************************************************************************/
import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numeroDeAlunos;
        int pesoaluno;
        int somaDePesos = 0; // Para somar os pesos dos alunos
        int aluno = 1;
        
        // Entrada de dados
        System.out.println("Digite quantos alunos estão matriculados na academia: ");
        numeroDeAlunos = ler.nextInt();
        
        while (aluno <= numeroDeAlunos) {
            // Entrada de dados
            System.out.print("Peso do " + aluno + "º aluno: ");
            pesoaluno = ler.nextInt();
            
            // Processamento
            somaDePesos += pesoaluno; // Somando o peso de cada aluno
            
            aluno++; // Incrementando o número do aluno
        }
        
        // Cálculo da média de peso
        int mediadepeso = somaDePesos / numeroDeAlunos;
        
        // Saída de dados
        System.out.println("A média de peso dos alunos é: " + mediadepeso);
        
    }  
    
}    
        
        