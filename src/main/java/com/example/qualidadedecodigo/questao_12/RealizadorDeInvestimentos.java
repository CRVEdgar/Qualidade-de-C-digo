package com.example.qualidadedecodigo.questao_12;


import static com.example.qualidadedecodigo.questao_12.TipoInvestimento.*;

public class RealizadorDeInvestimentos implements EstrategyInvestimento{
    VerificaCondicoes condicoes = new VerificaCondicoes();

    public RealizadorDeInvestimentos() {
    }

    @Override
    public Double estrategy(TipoInvestimento tipoInvestimento, Double saldo) {
        Double lucro = 0.0;

        if(tipoInvestimento.equals(CONSERVADOR)){
            lucro = saldo * 0.08;
            return lucro;

        }else if(tipoInvestimento.equals(MODERADO)){
            lucro = condicoes.verificarModerado(saldo);
            return lucro;

        }else if(tipoInvestimento.equals(ARROJADO)){
            lucro = condicoes.verificarArrojado(saldo);
            return lucro;
        }

        System.out.println("lucro 00");
        return lucro;
    }
}

