/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project01;

/**
 *
 * @author usuario 
 * 3 - Fazer um programa que imprima na tela as tabuadas do
 * número 1 a 9;
 */
public class Ex03 {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 10; j++){
            int r = i * j;
            System.out.printf("%d x 2 = %d\n", i, r);
            }
        }

    }
}
