/******************************************************************************
46 - Desenvolver um programa que ao iniciar o programa, exiba o seguinte menu de opções:

--- Calculadora de Áreas --- 
1. Calcular Área do Retângulo 
2. Calcular Área do Triângulo 
3. Calcular Área do Círculo 
0. Sair 
-- Escolha uma opção:

*******************************************************************************/
 import java.util.Scanner;
 
 public class Ex46
 {
     public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         
    
    int opcao;
    double base, altura, raio, area;
 
    //Entrada de dados
    System.out.println("--- Calculadora de Áreas ---\n");
    System.out.println("1. Calcular Área do Retângulo\n");
    System.out.println("2. Calcular Área do Triângulo\n");
    System.out.println("3. Calcular Área do Círculo\n");
    System.out.println("0. Sair\n");
    System.out.println("-- Escolha uma opção: ");
    opcao = ler.nextInt();

    //Processamento
    switch (opcao) {
       
        case 1:

            System.out.println("Digite a base do retângulo: ");
            base = ler.nextInt();
            System.out.println("Digite a altura do retângulo: ");
            altura = ler.nextInt();
            area = base * altura;
            System.out.println("A área do retângulo é: " + area);
            break;
       
        case 2:
           
            System.out.println("Digite a base do triângulo: ");
            base = ler.nextInt();
            System.out.println("Digite a altura do triângulo: ");
           altura = ler.nextInt();
            area = (base * altura) / 2;
            System.out.println("A área do triângulo é: " + area);
            break;
           
        case 3:
            
            System.out.println("Digite o raio do círculo: ");
            raio = ler.nextInt();
            area = 3.14 * (raio * raio);
            System.out.println("A área do círculo é: " + area );
            break;
         //Saída de dados
        case 0:
            System.out.println("Saindo do programa...\n");
            opcao = ler.nextInt ();
            break;
       
        default:
            System.out.println("Opção inválida! Tente novamente.\n");
         opcao = ler.nextInt ();
    }

}
}
