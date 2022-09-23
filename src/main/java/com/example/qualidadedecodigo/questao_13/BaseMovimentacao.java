package com.example.qualidadedecodigo.questao_13;

import java.util.Calendar;

abstract class BaseMovimentacao implements CalcImposto {

    private double valor;
    private String conta;
    private Calendar data;

    @Override
    public Double getEncargos(){
        return valor * 0.01;
    }

    public BaseMovimentacao() {
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
}
