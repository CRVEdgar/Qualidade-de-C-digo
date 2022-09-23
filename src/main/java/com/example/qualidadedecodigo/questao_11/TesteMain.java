package com.example.qualidadedecodigo.questao_11;

public class TesteMain {

    public static void main(String[] args) {
        PagadorDeFuncionario calcularPagamento;
        Double valorBase = 1500.20;
        Double acrescimos = 550.75;

        Chefe chefe = new Chefe();
        Funcionario funcionario = new Funcionario();
        Estagiario estagiario = new Estagiario();

        System.out.println(" ** CHEFE ** \n  - Total da Remuneração: " + chefe.calculaPagamento(valorBase, acrescimos) );
        System.out.println(" ** FUNCIONARIO ** \n  - Total da Remuneração: " + funcionario.calculaPagamento(valorBase*0.80, acrescimos*0.80) );
        System.out.println(" ** ESTAGIARIO ** \n  - Total da Remuneração: " + estagiario.calculaPagamento(valorBase*0.30, acrescimos*0.30) );

    }
}
