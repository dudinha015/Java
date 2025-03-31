/******************************************************************************
15) Escreva um programa que calcule a soma dos números de 1 a 15.

*******************************************************************************/
import java.util.Scanner;
public class Ex15

{
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int soma = 0, num;
		
	System.out.println ("Entre com um número desejado : ");
	num = ler.nextInt();
	
    for (int i = 1; i <=15; i ++)
    soma = soma + i;
	 System.out.println ("A soma é: " + soma); 
	}
}

    
    


