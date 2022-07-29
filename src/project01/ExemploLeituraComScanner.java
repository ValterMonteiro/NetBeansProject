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
public class ExemploLeituraComScanner {

    public static void main(String[] args) {
        System.out.print("Digite o seu nome: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        System.out.println("Nome: " + nome);
        float numero;
        try {
            System.out.print("Digite um numero: ");
            sc = new Scanner(System.in);
            numero = sc.nextFloat();
            System.out.println("Valor: " + numero);
        } catch (NumberFormatException erro) {
            System.out.println("Erro: " + erro.toString());
        }
    }
}
