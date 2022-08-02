/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista01;

import java.util.Scanner;

/**
 *
 * @author usuario
 * 10. Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de
números pares e a quantidade de números ímpares.
 */
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numeros = 0, somaPar = 0, somaImpar = 0;
        
        for(int i = 0; i < 10; i ++){
            System.out.println("Informe um número: ");
            numeros = sc.nextInt();
            
            if(numeros % 2 == 0){
                somaPar++;
            }else{
                somaImpar++;
            }
        }
            System.out.println("Soma par: " + somaPar);
            System.out.println("Soma impar: " + somaImpar);
    }
}
