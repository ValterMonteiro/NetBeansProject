/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excecoes;
class Main {
  public static void main(String[] args) {
    Conta minhaConta = new Conta();
    minhaConta.deposita(100);
    minhaConta.setLimite(100);
    try {
      minhaConta.saca(1000);
      System.out.println("Saque realizado");
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }  catch (SaldoInsuficienteException e) {
      System.out.println(e.getMessage());
    }
  }
}

class Conta {
  int numero;
  String titular;
  double saldo = 0;
  double limite = 0;

  public void setLimite(double valor) {
    limite = valor;
  }

  public void deposita(double valor) {
    saldo += valor;
  }

  public void saca(double quantidade) {
    // posso sacar até saldo+limite
    if (quantidade > this.saldo + this.limite) {
      // throw new IllegalArgumentException("Saldo insuficiente");
      throw new SaldoInsuficienteException("Saldo Insuficiente, tente um valor menor");
    } else {
      this.saldo = this.saldo - quantidade;
    }
  }
}

class SaldoInsuficienteException extends RuntimeException {
  SaldoInsuficienteException(String message) {
    super(message);
  }
}

