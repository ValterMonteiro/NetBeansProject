/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista01;

import java.util.Scanner;

/**
 *
 * @author usuario 
 * 8. Faça o programa que leia o nome, o peso, a idade e altura
 * de 20 pessoas e ao final informe: 
 * O nome da pessoa mais velha, 
 * o nome da pessoa mais nova, 
 * a média de peso das pessoas com mais de 25 anos e 
 * altura média das pessoas com menos de 10 anos.
 */
public class Ex08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "", nomeMaisVelha = "", nomeMaisNova = "";
        int idade, medPesoAcima25, medAlturaMenos10, maisVelha = 0, maisNova = 100;
        float peso = 0, somaPeso = 0, somaAltura = 0, altura = 0, pesoMaior25 = 0, alturaMenor10 = 0;

        for (int i = 0; i < 2; i++) {

            System.out.println("Informe o nome: ");
            nome = sc.next();

            System.out.println("Informe o peso: ");
            peso = sc.nextFloat();

            System.out.println("Informe a idade: ");
            idade = sc.nextInt();
            if (idade > maisVelha) {
                maisVelha = idade;
                nomeMaisVelha = nome;
            }
            if (idade < maisNova) {
                maisNova = idade;
                nomeMaisNova = nome;
            }
            if (idade > 25) {
                pesoMaior25++;
                somaPeso = somaPeso + pesoMaior25;
            }

            System.out.println("Informe a altuar: ");
            altura = sc.nextFloat();
            if (idade < 10) {
                alturaMenor10++;
                somaAltura = somaAltura + alturaMenor10;
            }
        }
            System.out.println("A pessoa mais velha é: " + nomeMaisVelha);
            System.out.println("A pessoa mais nova é: " + nomeMaisNova);
//            medPesoAcima25 = (somaPeso / 2);
//            medAlturaMenos10 = ( somaAltura/ 2);
    }
}
