/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista01;

import java.util.Scanner;

/**
 *
 * @author usuario
 * 4. Faça um um programa em Java que leia a porcentagem do IPI a ser acrescido no
    valor das peças - o código da peça 1, valor unitário da peça 1, quantidade de peças
    1 - o código da peça 2, valor unitário da peça 2, quantidade de peças 2 O algoritmo
    deve calcular o valor total a ser pago e apresentar o resultado. Fórmula :
    (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
 */
public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//        float ipi,vlr1, vlr2;
//        int qtd1, qtd2;
//        
//        System.out.println("Informe o % IPI: ");
//        sc = new Scanner(System.in);
//        ipi = sc.nextInt();
//        
//        System.out.println("Informe o valor da peça 1: ");
//        sc = new Scanner(System.in);
//        vlr1 = sc.nextFloat();
//        
//        System.out.println("Informe quantidade da peça 1: ");
//        sc = new Scanner(System.in);
//        qtd1 = sc.nextInt();
//        
//        System.out.println("Total: " + ((vlr1 * qtd1)*(1+(ipi/100))));
        
        int qtdPecas, qdt;
        float vlr, ipi2, total;
        System.out.println("quantidade de peças: ");
        sc = new Scanner(System.in);
        qtdPecas = sc.nextInt();
        for( int i = 1; i <= qtdPecas; i++){
            
            System.out.println("valor: ");
            sc = new Scanner(System.in);
            float vlr = sc.nextFloat();
            
            System.out.println("quantidade: ");
            sc = new Scanner(System.in);
            int qtd = sc.nextInt();
            
            System.out.println("% ipi: ");
            sc = new Scanner(System.in);
            float ipi2 = sc.nextFloat();
            
        }
        total = ((vlr * qtd)*(1+(ipi2/100)));
            total++;
            System.out.println("Total: " + total);
        
    }
    
}
