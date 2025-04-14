/******************************************************************************

                Exercicio01: Elabore um programa para ler o nome e idade de 5 pessoas 
                guardar esses dados em array. apresentar o nome e a idade das pessoas maiores de idade

*******************************************************************************/
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner ler = new ler(System.in);

        
        String[] nomes = new String[5];
        int[] idades = new int[5];

        // Leitura dos dados
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome da " + (i + 1) + "ª pessoa: ");
            nomes[i] = ler.nextLine();

            System.out.print("Digite a idade de " + nomes[i] + ": ");
            idades[i] = ler.nextInt();
            ler.nextLine();
        }

      
        System.out.println("\nPessoas maiores de idade:");
        for (int i = 0; i < 5; i++) {
            if (idades[i] >= 18) {
                System.out.println(nomes[i] + " - " + idades[i] + " anos");
            }
        }

       
    }
}