/******************************************************************************
19) Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.


*******************************************************************************/
import java.util.Scanner;
public class Ex19

{
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int idade, idade_menor=200;
		String nome,nome_menor="";
		
	for (int i = 1; i <= 10; i++) {
	    
	        
	        System.out.println ("Entre com o nome desejado: ");
            nome  = ler.nextLine();
            
            System.out.println ("Entre com a idade desejada: ");
            idade = ler.nextInt();
            
            if (idade < idade_menor ){
                idade_menor = idade;
                nome_menor = nome;
            }
          //Limpar o buffer de memória
          ler.nextLine();
         
	     }
	     System.out.println("A idade da pessoa que é de menor é: " + idade_menor);
	     System.out.println("O nome da pessoa que é de menor é: " + nome_menor);
	
	}
}
    