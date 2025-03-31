/******************************************************************************

                   Criar um exemplo sobre estrutura de repetição

*******************************************************************************/
import java.util.Scanner;
public class Tabuada
{
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n;
		
	System.out.println ("Digite o número da tabuada: ");
	n = ler.nextInt();
	
	for (int i=1 ; i<= 10; i++)
	 System.out.println("Número "+ (i* n));
	}
}