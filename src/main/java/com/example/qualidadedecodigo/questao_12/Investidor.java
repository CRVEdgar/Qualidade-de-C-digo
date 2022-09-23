package com.example.qualidadedecodigo.questao_12;

public class Investidor {
    private String nome;
    private Conta conta;
    private TipoInvestimento tipoInvestimento;


    public Investidor() {
    }

    public Investidor(String nome, Conta conta, TipoInvestimento tipoInvestimento) {
        this.nome = nome;
        this.conta = conta;
        this.tipoInvestimento = tipoInvestimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public TipoInvestimento getTipoInvestimento() {
        return tipoInvestimento;
    }

    public void setTipoInvestimento(TipoInvestimento tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }


    @Override
    public String toString() {
        return "Investidor{" +
                "nome='" + nome + '\'' +
                ", conta=" + conta.getSaldo() +
                ", tipoInvestimento=" + tipoInvestimento +
                '}';
    }

}
