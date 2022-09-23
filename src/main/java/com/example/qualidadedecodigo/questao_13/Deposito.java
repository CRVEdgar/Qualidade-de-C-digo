package com.example.qualidadedecodigo.questao_13;

public class Deposito extends BaseMovimentacao {
    private String numeroEnvelope;

    public Deposito() {
    }

    public Deposito(String numeroEnvelope) {
        this.numeroEnvelope = numeroEnvelope;
    }


    @Override
    public Double getEncargos() {
            throw new RuntimeException("Depositos não sofrem encargos");
    }
}
