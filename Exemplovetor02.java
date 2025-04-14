/******************************************************************************

                Exemplo02: utilizando array e visualizando a entrada de dados que foi 
                inserido pelo usuário

*******************************************************************************/
import java.util.Scanner;
public class Exemplovetor02
{
	public static void main(String[] args) {
		int[] numeros = new int [5];
		Scanner ler = new Scanner(System.in);
		
		//Entrada de dados
			for (int i=0; i<numeros.length; i++){
			    System.out.println("Digite o " + (i+1) + "º número: ");
			    numeros[i] = ler.nextInt();
			}	
		//Saída de dados
		for (int i=0; i<numeros.length; i++){
		    System.out.println ("O " + (i+1) + "º número é: " + numeros [i]);
		}	    
	    }
}
