package org.locadora.classificacao;

public class ClassificacaoNull extends Classificacao {
    @Override
    public int getCodigoPreco() {
        return 404;
    }

    @Override
    public double getValorDoAluguel(int diasAlugado) {
        return 0;
    }

    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugado) {
        return 0;
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
