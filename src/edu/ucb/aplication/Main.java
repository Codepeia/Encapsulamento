package edu.ucb.aplication;

import edu.ucb.model.Conta;


public class Main {
    public static void main(String[] args) {
       Conta conta = new Conta(1000.0, 2000.0);
       
       conta.depositar(1000.0);
       
       conta.sacar(200.0);
       
    }
}
