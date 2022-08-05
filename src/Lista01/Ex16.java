/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista01;
import java.util.Scanner;

/**
 *
 * @author usuario
 * 16. Desenvolva um programa que faça a tabuada de um número qualquer inteiro que
será digitado pelo usuário, mas a tabuada não deve necessariamente iniciar em 1 e
terminar em 10, o valor inicial e final devem ser informados também pelo usuário.
 */
public class Ex16 {
    public static void main(String[] args) {
    int num, inicio, fim, aux;
    boolean primo;
    Scanner sc = new Scanner(System.in);
    System.out.println("digite um número inteiro: ");
    num = sc.nextInt();
    System.out.println("digite o valor de inicio: ");
    inicio = sc.nextInt();
    System.out.println("digite o valor de fim: ");
    fim = sc.nextInt();
    if (inicio > fim) {
      aux = inicio;
      inicio = fim;
      fim = aux;
    }
    for (int i=inicio; i <= fim; i++){
      System.out.println(i + " x " + num + " = " + (i*num));
    }
  }
}

