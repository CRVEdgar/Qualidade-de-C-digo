package com.example.qualidadedecodigo.questao_12;

public class Conta {
    private String tipoConta;
    private Double saldo;

    public Conta() {
    }

    public Conta(String tipoConta, Double saldo) {
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void adicionarLucro( Double lucro){
        this.saldo += lucro;
    }
}
