package edu.ucb.model;

public class Conta {

    //modificador de acesso
    private String titular;
    private double saldo;
    private int numero;
    private double limite;

    public Conta(double valor, double limite) {
        this.limite = limite;
        saldo = valor;
    }

    private void saldoComLimite() {
        saldo = saldo + limite;
        System.out.println("Saldo com limite: " + saldo);
    }

    private void saldoSemLimite() {
        saldo = saldo - limite;
        System.out.println("Saldo sem limite: " + saldo);
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito efetuado com sucesso");
        System.out.println("Saldo atual" + saldo);
    }

    public double sacar(double valor) {
        saldoComLimite();
        saldoSemLimite();

        if (valor > (saldo + limite)) {
            System.out.println("Saldo indisponível");
            return 0.0;
        } else {
            saldo -= valor;
            saldoComLimite();
            saldoSemLimite();
        }
        return saldo;
    }
  
}
