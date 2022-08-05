/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista01;
import java.util.Scanner;

/**
 *
 * @author usuario
 * 14. Os números primos possuem várias aplicações dentro da Computação, por exemplo
na criptografia. Um número primo é aquele que é divisível apenas por um e por ele
mesmo. Faça um programa que peça um número inteiro e determine se ele é ou não
um número primo.

 */
public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = sc.nextInt();
        boolean primo;
        primo = true;
        for(int i= 2; i <= num/2; i++ ){
            if(num % i == 0){
                primo = false;
                break;
            }
        }
        if(primo){
            System.out.println("Número é primo: ");
        }else{
            System.out.println("Número não é primo: ");
        }
    }
}
