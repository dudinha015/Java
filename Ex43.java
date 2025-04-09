/******************************************************************************
43 - Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. Após o aumento,
desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento e o salário final. 
 *******************************************************************************/
import java.util.Scanner;

public class Ex43{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

       double salario,aumento,imposto, salariocomimposto,salariocomaumento;
        // Entrada de dados
        System.out.println("Entre com a quantidade atual de salario: ");
        salario= ler.nextInt();

        // Processamento
        salariocomaumento = (salario * 15/100) + salario;
        salariocomimposto = salariocomaumento - (salariocomaumento *8/100);

        // Saída de dados
        System.out.println("O valor do salario atual era de : R$" + salario); 
        System.out.println("O valor do salario com o aumento será de : R$" + salariocomaumento);
        System.out.println("O valor do salario com imposto será de : R$" + salariocomimposto);
    }
}