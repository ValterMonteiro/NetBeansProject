/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista01;
import java.util.Scanner;

/**
 *
 * @author usuario
 * 6. Um programa para gerenciar os saques de um caixa eletrônico deve possuir algum
mecanismo para decidir o número de notas de cada valor que deve ser
disponibilizado para o cliente que realizou o saque. Um possível critério seria o da
"distribuição ótima" no sentido de que as notas de menor valor fossem distribuídas
em número mínimo possível. Por exemplo, se a quantia solicitada fosse R$ 87,00, o
programa deveria indicar uma nota de R$ 50,00, três notas de R$ 10,00, uma nota
de R$ 5,00 e duas notas de R$ 1,00. Escreva um programa que receba o valor da
quantia solicitada e retorne a distribuição das notas de acordo com o critério da
distribuição ótima (considere existir notas de R$1,00; R$2,00; R$5,00; R$10,00;
R$20,00; R$50,00 e R$100,00).
 */
public class Ex06 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        
//        float valorSaque = 0;
//        int notaDe100 = 100, qtdNotas100 = 0, notaDe50 = 50, notaDe20 = 20, notaDe10 = 10, notaDe5 = 5, notaDe2 = 2, notaDe1 = 1;
//        System.out.println("Informe o valor para saque: ");
//        sc = new Scanner(System.in);
//        valorSaque = sc.nextFloat();
//        
//        while(valorSaque == 0){
//            
//            if(valorSaque / notaDe100 >= 1){
//                valorSaque = valorSaque - notaDe100;
//                qtdNotas100++;
//            }
//            if(valorSaque / notaDe50 >= 1){
//                valorSaque = valorSaque - notaDe50;
//                //notaDe50++;
//            }
//            if(valorSaque / notaDe20 >= 1){
//                valorSaque = valorSaque - notaDe20;
//                //notaDe20++;
//            }
//            if(valorSaque / notaDe10 >= 1){
//                valorSaque = valorSaque - notaDe10;
//                //notaDe10++;
//            }
//            if(valorSaque / notaDe5 >= 1){
//                valorSaque = valorSaque - notaDe5;
//                //notaDe5++;
//            }
//            if(valorSaque / notaDe2 >= 1){
//                valorSaque = valorSaque - notaDe2;
//                //notaDe2++;
//            }
//            if(valorSaque / notaDe1 > 1){
//                valorSaque = valorSaque - notaDe1;
//                //notaDe1++;
//        System.out.println("Valor do saque: " + valorSaque);
//        System.out.println("Quantidade de notas de R$100: " + qtdNotas100);
//        System.out.println("Quantidade de notas de R$50: " + notaDe50);
//        System.out.println("Quantidade de notas de R$20: " + notaDe20);
//        System.out.println("Quantidade de notas de R$10: " + notaDe10);
//        System.out.println("Quantidade de notas de R$5: " + notaDe5);
//        System.out.println("Quantidade de notas de R$2: " + notaDe2);
//        System.out.println("Quantidade de notas de R$1: " + notaDe1);
//            }
            
        System.out.println("Digite o valor do Saque: ");
        int valorSaque = sc.nextInt();
        int n200 = valorSaque/200;
        valorSaque = valorSaque % 200;
        int n100 = valorSaque/100;
        valorSaque = valorSaque % 100;
        int n50 = valorSaque/50;
        valorSaque = valorSaque % 50;
        int n20 = valorSaque/20;
        valorSaque = valorSaque % 20;
        int n10 = valorSaque/10;
        valorSaque = valorSaque % 10;
        int n5 = valorSaque/5;
        valorSaque = valorSaque % 5;
        int n2 = valorSaque/2;
        int n1 = valorSaque % 2;
        System.out.println("200: " + n200 + "\n" + "100: " + n100 + "\n 50: " + n50 + 
                "\n 20: " + n20 + "\n 10: " + n10 + "\n 5: " + n5 + "\n 2: " 
                + n2 + "\n 1: " + n1);

                
        }
        
}