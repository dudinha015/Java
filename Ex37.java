/******************************************************************************
37 - Faça um algoritmo para calcular quantas ferraduras são 
necessárias para equipar todos os cavalos comprados para um haras.


*******************************************************************************/
import java.util.Scanner;
public class Ex37
{
	public static void main(String[] args) {
	 Scanner ler = new Scanner(System.in);
	 
	 
	 int QntdFerraduras = 4;
	 int cavalos,QntdFinal;
	 
	
	//Entrada de dados
	 System.out.println ("Entre com a quantidade de cavalos: ");
	 cavalos = ler.nextInt();
	 
	 
	 //Processamento
	 
	 QntdFinal = cavalos * 4 ;
	 System.out.println ("A Quantidade final de ferraduras compradas será de :" +  QntdFinal);
	}
}