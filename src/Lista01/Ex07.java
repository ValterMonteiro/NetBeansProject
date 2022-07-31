/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista01;

import java.util.Scanner;

/**
 *
 * @author usuario
 * 7. Faça um programa que receba a idade e o peso de sete pessoas. Calcule e mostre:
   A quantidade de pessoas com mais de 90 quilos; 
*  A média das idades das sete
pessoas;
 */
public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int idade, medIdade, maior90k = 0;
        float peso = 0, soma = 0;
        
        for( int i = 0; i < 7; i ++){
            System.out.println("Informe a idade: ");
            idade = sc.nextInt();
            
            System.out.println("Informe o peso: ");
            peso = sc.nextFloat();
            
            if(peso > 90){
                maior90k ++;
            }
            soma = soma + idade;
        }
        medIdade = (int) (soma/7);
        System.out.println("Total de pessoas com mais de 90k: " + maior90k);
        System.out.println("A média de idade é: " + medIdade);
    }
}
