/******************************************************************************
18) Leia a idade de 20 pessoas e exiba a soma das idade, a média das idades e quantas pessoas são maiores de idade.


*******************************************************************************/
import java.util.Scanner;
public class Ex18

{
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int media = 0, idade, resultado, total = 0;
		
	for (int i = 1; i <= 20; i++) {
	    
	        
            System.out.println ("Entre com a idade desejada: ");
            idade = ler.nextInt();
             media = ( idade + media);
              resultado = media /20;
              total = total + 1;
         
	     }
	     System.out.println("A quantidade de pessoas maiores de idades são : " + total);
	
	}
}
    