/******************************************************************************

                   Criar um exemplo sobre estrutura de repetição

*******************************************************************************/
import java.util.Scanner;
public class Repeticaoex
{
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n;
		
	System.out.println ("Digite um número que seja maior que zero: ");
	n = ler.nextInt();
	
	for (int i=0; i <= n; i++)
	 System.out.println("Número "+i);
	}
}