/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista01;

/**
 *
 * @author usuario
 * 12. A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,... Faça um
programa que gere a série até que o valor seja maior que 500.
 */
public class Ex12 {
    public static void main(String[] args) {
        int ant = 0, suc = 1;
        System.out.println(ant);
        System.out.println(suc);
        while(suc <= 500){
            suc = suc + ant;
            ant = suc - ant;
            System.out.println(suc);
        }
    }
}
