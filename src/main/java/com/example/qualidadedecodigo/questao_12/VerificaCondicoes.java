package com.example.qualidadedecodigo.questao_12;

import java.util.Random;

public class VerificaCondicoes {

    public VerificaCondicoes() {
    }

    Double lucro = 0.0;
    Random random = new Random();
    boolean retorno;

    public Double verificarModerado(Double saldo){

        if(retorno = random.nextDouble() > 0.50){
            System.out.println("chance > 0.50");
            lucro = saldo * 0.025;
            return lucro;
        }else{
            System.out.println("chance < 0.50");
            lucro = saldo * 0.025;
            return lucro;
        }
    }


    public Double verificarArrojado(Double saldo){
        Double chance = random.nextDouble();
        if(chance <= 0.20){
            lucro = saldo * 0.05;
            System.out.println("chance <= 0.20");
            return lucro;
        }else if(chance > 0.20 && chance <50){
            System.out.println("chance >= 0.30 && chance <=50");
            lucro = saldo * 0.03;
            return lucro;
        }else if(chance >= 0.50){
            System.out.println("chance >= 0.50");
            lucro = saldo * 0.006;
            return lucro;
        }
        return lucro;
    }
}
