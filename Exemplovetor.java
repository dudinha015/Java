/******************************************************************************

                Exemplo: utilizando array e visualizando a saída de dados

*******************************************************************************/
import java.util.Scanner;
public class Exemplovetor
{
	public static void main(String[] args) {
		int[] numeros = new int [5];
		
		numeros [0] = 10;
		numeros [1] = 20;
		numeros [2] = 30;
		numeros [3] = 40;
		numeros [4] = 50;
		
		//Saída de dados
		for (int i=0; i<numeros.length; i++){
		    System.out.println ("O " + (i+1) + "º número é: " + numeros [i]);
		    
		}
	}
}