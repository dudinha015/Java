/******************************************************************************
14. Escreva um programa que exiba 10 vezes a mensagem “Eu gosto de estudar Algoritmos!”.

*******************************************************************************/
import java.util.Scanner;
public class Algoritmos
{
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int num;
		
	System.out.println ("Digite o número que deseja: ");
	num = ler.nextInt();
	
	for (int i=0 ; i<= 10; i++)
	 System.out.println("Eu gosto de estudar algoritmos!");
	}
}