/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project01;

/**
 *
 * @author usuario
 */
public class Ex02 {

    /*
    2 - Criar um programa que faça a comparação de 3 números e informe o maior;
     */
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        if (a > b && a > c) {
            System.out.println("Maior " + a);
        } else {
            if (b > c) {
                System.out.println("Maior " + b);
            } else {
                System.out.println("Maior " + c);
            }

        }
    }
}
