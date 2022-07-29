/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project01;

/**
 *
 * @author usuario
 */
public class Ex01 {

    /*
    1 - Criar um programa que imprima todos os números pares entre 0 e 100 (inclusive);
     */
    public static void main(String[] args) {
//        for (int i = 0; i <= 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println("Pares" + i);
//            }
//        }
        
        for(int i = 0; i <=100; i+=2){
            System.out.println("Pares: " + i);
        }
    }

}
