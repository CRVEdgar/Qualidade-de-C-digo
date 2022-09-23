package com.example.qualidadedecodigo.questao_11;

public class Estagiario implements PagadorDeFuncionario{

    private Double bolsa;
    private Double auxilios;
    private Double salario;

    public Estagiario() {
    }

    public Estagiario(Double bolsa, Double auxilios, Double salario) {
        this.bolsa = bolsa;
        this.auxilios = auxilios;
        this.salario = salario;
    }

    public Estagiario(Double bolsa, Double auxilios) {
        this.bolsa = bolsa;
        this.auxilios = auxilios;
    }

    public Double getBolsa() {
        return bolsa;
    }

    public void setBolsa(Double bolsa) {
        this.bolsa = bolsa;
    }

    public Double getAuxilios() {
        return auxilios;
    }

    public void setAuxilios(Double auxilios) {
        this.auxilios = auxilios;
    }

    public Double getSalario() {
        return salario;
    }

    @Override
    public Double calculaPagamento(Double valorBase, Double acrescimos) {
        this.salario = valorBase + acrescimos;
        return salario;
    }
}
