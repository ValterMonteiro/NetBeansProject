/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista01;

import java.util.Scanner;

/**
 *
 * @author usuario 1. Faça um um programa em Java que leia a idade de uma pessoa
 * expressa em anos, meses e dias e mostre-a expressa em dias. Leve em
 * consideração o ano com 365 dias e o mês com 30. (Ex: 3 anos, 2 meses e 15
 * dias = 1170 dias.)
 */
public class Ex01 {

    public static void main(String[] args) {
        int anos, meses, dias;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua idade em:");
        System.out.println("Anos, considerando 365 dias?");
        sc = new Scanner(System.in);
        anos = sc.nextInt();
        System.out.println("Meses, considerando 30 dias?");
        sc = new Scanner(System.in);
        meses = sc.nextInt();
        System.out.println("Dias?");
        dias = sc.nextInt();
        
        System.out.println(anos + " anos," + meses + " meses e " + dias + " dias = " +
                ((anos * 365)+(meses * 30)+ dias));
    }

}
