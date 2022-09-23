package com.example.qualidadedecodigo.questao_13;

public class Pagamento extends BaseMovimentacao{

    private String favorecido;
    private String formaDePagamento;

    public Pagamento() {
    }

    public Pagamento(String favorecido, String formaDePagamento) {
        this.favorecido = favorecido;
        this.formaDePagamento = formaDePagamento;
    }

    public String getFavorecido() {
        return favorecido;
    }

    public void setFavorecido(String favorecido) {
        this.favorecido = favorecido;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }




}
