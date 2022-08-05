/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista01;

import java.util.Scanner;

/**
 *
 * @author usuario 9. Faça um programa que receba dois números inteiros e gere
 * os números inteiros que estão no intervalo compreendido por eles.
 */
public class Ex09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int primeiroNumero, segundoNumero;

        System.out.println("Informe o primeiro número: ");
        primeiroNumero = sc.nextInt();

        System.out.println("Informe o segundo número: ");
        segundoNumero = sc.nextInt();
        
        System.out.println("Veja o intervalo entre os números:");

        if (primeiroNumero < segundoNumero) {
            for (int i = primeiroNumero; i <= segundoNumero; i++) {
                System.out.println(i);

            }
        } else {
            for (int i = segundoNumero; i <= primeiroNumero; i++) {
                System.out.println(i);
            }

        }
    }
}
