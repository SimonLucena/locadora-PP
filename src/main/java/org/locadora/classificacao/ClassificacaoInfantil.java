package org.locadora.classificacao;

public class ClassificacaoInfantil extends Classificacao {

    public int getCodigoPreco() { return Classificacao.INFANTIL; }

    @Override
    public double getValorDoAluguel(int diasAlugado) {
        double valorDvd = 1.5; // 1.50 por 3 dias
        if (diasAlugado > 3) {
            valorDvd += (diasAlugado - 3) * 1.5;
        }
        return valorDvd;
    }
}


