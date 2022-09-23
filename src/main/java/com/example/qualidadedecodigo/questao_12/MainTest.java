package com.example.qualidadedecodigo.questao_12;


import static com.example.qualidadedecodigo.questao_12.TipoInvestimento.*;

public class MainTest {

    public static void main(String[] args) {
        Conta contaConservador = new Conta("corrente", 100.0);
        Conta contaModerado = new Conta("poupanca", 100.0);
        Conta contaArrojado = new Conta("salario", 100.0);

        RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();
        Double valorLucroArrojado, valorLucroModerado, valorLucroConservador;

        Investidor investidorConservador = new Investidor("Mario - conservador ", contaConservador, CONSERVADOR);
        Investidor investidorModerado = new Investidor("Luis - moderado", contaModerado, MODERADO);
        Investidor investidorArrojado = new Investidor("Sandro - arrojado", contaArrojado, ARROJADO);

        System.out.println(investidorConservador);
        System.out.println(investidorArrojado);
        System.out.println(investidorModerado);


        valorLucroConservador  = realizadorDeInvestimentos.estrategy(
                investidorConservador.getTipoInvestimento(), investidorConservador.getConta().getSaldo()
        );
        valorLucroModerado = realizadorDeInvestimentos.estrategy(
                investidorModerado.getTipoInvestimento(), investidorModerado.getConta().getSaldo()
        );
        valorLucroArrojado = realizadorDeInvestimentos.estrategy(
                investidorArrojado.getTipoInvestimento(), investidorArrojado.getConta().getSaldo()
        );
        investidorConservador.getConta().adicionarLucro(valorLucroConservador);
        investidorArrojado.getConta().adicionarLucro(valorLucroModerado);
        investidorModerado.getConta().adicionarLucro(valorLucroArrojado);

        System.out.println("PERFIL CONSERVADOR - lucro gerado: " + valorLucroConservador + "\n Novo saldo em conta: " + investidorConservador.getConta().getSaldo());
        System.out.println("PERFIL ARROJADO - lucro gerado: " + valorLucroModerado + "\n Novo saldo em conta: " + investidorArrojado.getConta().getSaldo());
        System.out.println("PERFIL MODERADO - lucro gerado: " + valorLucroArrojado + "\n Novo saldo em conta: " + investidorModerado.getConta().getSaldo());
        
    }
}
