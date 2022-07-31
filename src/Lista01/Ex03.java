/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista01;

import java.util.Scanner;

/**
 *
 * @author usuario
 * 3. Faça um um programa em Java que leia o valor de um produto e a porcentagem de
aumento, ao final mostre o valor do aumento e o novo valor do produto.
 */
public class Ex03 {
    public static void main(String[] args) {
        float valor, aumento, novoVlr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor: ");
        sc = new Scanner(System.in);
        valor = sc.nextFloat();
        System.out.println("Informe o % aumento: ");
        sc = new Scanner(System.in);
        aumento = sc.nextFloat();
        
        System.out.println("O valor de aumento é: " + (valor * (aumento / 100)) +
                "\n" + "O novo valor é: " + (valor * (1 + ((aumento/100)))));
        
    }
}
