/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project01;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class ExemploJOptionPane {
    public static void main(String[] args) {
    String nome, aux;
    float numero;
    try {
      nome = JOptionPane.showInputDialog("Entre com o nome");
      aux = JOptionPane.showInputDialog("Entre com um numero");
      numero = Float.parseFloat(aux);
      JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n Número: " + numero);
    } catch (NumberFormatException erro) {
      JOptionPane.showMessageDialog(null, "Erro: " + erro.toString());
    }
    System.exit(0);
  }
}
