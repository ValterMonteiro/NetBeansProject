/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista01;

/**
 *
 * @author usuario
 * 2. Faça um um programa em Java que imprima a média aritmética dos números 8,9 e
7. A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.
 */
public class Ex02 {
    public static void main(String[] args) {
        float med1, med2, somaMed, medMed;
        
        med1 = (8+9+7)/3;
        med2 = (4+5+6)/3;
        somaMed = med1 + med2;
        medMed = (med1+med2)/2;
        
        System.out.println(med1);
        System.out.println(med2);
        System.out.println(somaMed);
        System.out.println(medMed);
    }
}
