/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista01;

import java.util.Scanner;

/**
 *
 * @author usuario
 * 5. Faça um um programa em Java que leia o valor do salário mínimo e o valor do
salário de um usuário, calcule a quantidade de salários mínimos que esse usuário
ganha e imprima o resultado.
 */
public class Ex05 {
    public static void main(String[] args) {
        float slrMinimo, seuSlr, qtdSlr;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor do salário mínimo: ");
        sc = new Scanner(System.in);
        slrMinimo = sc.nextFloat();
        
        System.out.println("Informe o valor do seu salário: ");
        sc = new Scanner(System.in);
        seuSlr = sc.nextFloat();
        
        qtdSlr = (seuSlr / slrMinimo);
        System.out.println("Seu salário, equivale a: " + qtdSlr + " do salário mínimo.");
    }
}
