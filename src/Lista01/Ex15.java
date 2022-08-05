/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista01;
import java.util.Scanner;

/**
 *
 * @author usuario
 * 15. Encontrar números primos é uma tarefa difícil. Faça um programa que gera uma lista
dos números primos existentes entre 1 e um número inteiro informado pelo usuário.
 */
public class Ex15 {
     public static void main(String[] args) {
    int num;
    boolean primo;
    Scanner sc = new Scanner(System.in);
    System.out.println("digite um número inteiro: ");
    num = sc.nextInt();
    for (int j=1; j <= num; j++){
      primo = true;
      for (int i=2; i <= j/2; i++){
        if (j % i == 0){
          primo = false;
          break;
        }
      }
      if (primo) { 
        System.out.println(j);
      } 
    }
  }
}
