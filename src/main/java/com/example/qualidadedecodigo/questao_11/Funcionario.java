package com.example.qualidadedecodigo.questao_11;

public class Funcionario implements PagadorDeFuncionario {
    private Double salario;
    private Double bonus;
    private Double salarioBruto;

    public Funcionario() {
    }

    public Funcionario(Double salario, Double bonus, Double salarioBruto) {
        this.salario = salario;
        this.bonus = bonus;
        this.salarioBruto = salarioBruto;
    }

    public Funcionario(Double salario, Double bonus) {
        this.salario = salario;
        this.bonus = bonus;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    @Override
    public Double calculaPagamento(Double valorBase, Double acrescimos) {
        this.salarioBruto = valorBase + acrescimos;
        return salarioBruto;
    }
}
