/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista01;

import java.util.Scanner;

/**
 *
 * @author usuario 11. 
 * A série de Fibonacci é formada pela sequência
 * 1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série até o
 * n−ésimo termo que deve ser informado pelo usuário.
 */
public class Ex11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 1, num2 = 0, valor;

        System.out.println("Informe o valor: ");
        valor = sc.nextInt();
            System.out.println(num2);
            System.out.println(num1);

        for (int i = 0; i <= valor; i++) {            
            num1 = num1 + num2;
            num2 = num1 - num2;

            System.out.println(num1);

        }
    }
}
