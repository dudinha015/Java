/******************************************************************************
53.Faça um programa que leia 10 valores reais e os apresente na ordem:
       a) crescente
       b) decrescente
       c) inversa da entrada.

*******************************************************************************/
import java.util.Scanner;

public class Ex53 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        double[] valores = new double[10];

        System.out.println("Digite 10 valores reais:");

     
        for (int i = 0; i < 10; i++) {
            valores[i] = ler.nextDouble();
        }

       
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (valores[i] > valores[j]) {
                    double temp = valores[i];
                    valores[i] = valores[j];
                    valores[j] = temp;
                }
            }
        }
        
        System.out.println("\nOrdem crescente:");
      
        for (double valor : valores) {
            System.out.print(valor + " ");
        }

        
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (valores[i] < valores[j]) {
                    double temp = valores[i];
                    valores[i] = valores[j];
                    valores[j] = temp;
                }
            }
        }

        System.out.println("\nOrdem decrescente:");
        
        for (double valor : valores) {
            System.out.print(valor + " ");
        }

      
        System.out.println("\nOrdem inversa da entrada:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(valores[i] + " ");
        }
        
    }
}