/******************************************************************************
42 - Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo
vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário forneça a
quantidade de camisetas pequenas, médias e grandes referentes a uma venda, e a máquina
informe quanto será o valor arrecadado.  
 *******************************************************************************/
import java.util.Scanner;

public class Ex42{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

       int camisetapequena,camisetamedia,camisetagrande, valorpeq,valormed,valorgr,valortotal;

        // Entrada de dados
        System.out.println("Entre com a quantidade vendida de camisetas pequenas: ");
        camisetapequena= ler.nextInt();

        System.out.println("Entre com a quantidade vendida de camisetas médias: ");
        camisetamedia= ler.nextInt();
        
        System.out.println("Entre com a quantidade vendida de camisetas grandes: ");
        camisetagrande= ler.nextInt();
        // Processamento
        valorpeq = camisetapequena * 10;
        valormed = camisetamedia * 12;
        valorgr = camisetagrande * 15;
        valortotal = valorpeq + valormed + valorgr;

        // Saída de dados
        System.out.println("O valor total que foi arrecadado pelas vendas foi de : R$" + valortotal); 
    }
}