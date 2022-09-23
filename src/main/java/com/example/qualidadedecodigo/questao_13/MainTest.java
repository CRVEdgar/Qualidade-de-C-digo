package com.example.qualidadedecodigo.questao_13;

public class MainTest {
    public static void main(String[] args) {
        BaseMovimentacao movimentacao = new Deposito("123");
        BaseMovimentacao movimentacao1 = new Pagamento("Joao", "credito");

        movimentacao1.setValor(100.0);
        movimentacao.setValor(200.0);
        System.out.println(movimentacao1.getEncargos());
        System.out.println(movimentacao.getEncargos());
    }
}
