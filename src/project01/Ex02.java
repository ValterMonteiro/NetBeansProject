/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project01;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ex02 {

    /*
    2 - Criar um programa que faça a comparação de 3 números e informe o maior;
     */
    public static void main(String[] args) {
//        int a;
//        int b;
//        int c;
//        int maior;
//        
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Digite o primeiro número: ");
//        a = sc.nextInt();
//        System.out.print("Digite o segundo número: ");
//        b = sc.nextInt();
//        System.out.print("Digite o terceiro número: ");
//        c = sc.nextInt();
//        
//        if (a > b) {
//            maior = a;
//        } else {
//            maior = c;
//            System.out.println("Maior" + maior);
//        }

        float maior,
                num;
        int count = 2;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Numero 1: ");
        num = entrada.nextFloat();
        maior = num;

        while (count <= 3) {
            System.out.print("Numero " + count + ": ");
            num = entrada.nextFloat();

            if (num > maior) {
                maior = num;
            }

            count++;
        }

        System.out.println("O maior numero digitado é: " + maior);
                
    }
}
