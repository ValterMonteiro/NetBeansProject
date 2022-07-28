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
        int a = 3;
        int b = 5;
        int c = 7;
        int maior = 0;
    
        if(a > maior){
            maior = a;
        }
        if(b > maior){
            maior = b;
        }else{
            maior = c;
        System.out.println("Maior" + maior);
        } 
    }
}
