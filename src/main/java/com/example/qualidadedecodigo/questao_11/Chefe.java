package com.example.qualidadedecodigo.questao_11;

public class Chefe implements PagadorDeFuncionario {
    private Double salarioBase;
    private Double bonificacoes;
    private Double salarioBruto;

    public Chefe() {
    }

    public Chefe(Double salarioBase, Double bonificacoes, Double salarioBruto) {
        this.salarioBase = salarioBase;
        this.bonificacoes = bonificacoes;
        this.salarioBruto = salarioBruto;
    }

    public Chefe(Double salarioBase, Double bonificacoes) {
        this.salarioBase = salarioBase;
        this.bonificacoes = bonificacoes;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getBonificacoes() {
        return bonificacoes;
    }

    public void setBonificacoes(Double bonificacoes) {
        this.bonificacoes = bonificacoes;
    }

    @Override
    public Double calculaPagamento(Double valorBase, Double acrescimos) {
        this.salarioBruto = valorBase + acrescimos;
        return salarioBruto;
    }
}
