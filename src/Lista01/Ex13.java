/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista01;
import java.util.Scanner;

/**
 *
 * @author usuario
 * 13. O Departamento Estadual de Meteorologia lhe contratou para desenvolver um
programa que leia um conjunto indeterminado de temperaturas, e informe ao final a
menor e a maior temperaturas informadas, bem como a média das temperaturas.
 */
public class Ex13 {
    public static void main(String[] args) {
        float temp, maior=0, menor=0, soma=0, media;
        int quant=0, continua=1;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Digite uma temperatura: ");
            temp = sc.nextFloat();
            quant++;
            soma += temp;
            if (quant == 1 || temp > maior) {
                maior = temp;
            }
            if (quant == 1 || temp < menor) {
                menor = temp;
            }
            do {
                System.out.println("1: continua e 0: encerra");
                continua =  sc.nextInt();
            } while (continua != 1 && continua != 0);
        } while (continua == 1);
        System.out.println("Maior Temperatura: " + maior);
        System.out.println("Menor Temperatura: " + menor);
        media = soma / quant;
        System.out.println("Média das temperaturas: " + media);
    }
}
