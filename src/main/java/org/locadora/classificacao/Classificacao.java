package org.locadora.classificacao;

public abstract class Classificacao {
    public static final int NORMAL = 0;
    public static final int LANÇAMENTO = 1;
    public static final int INFANTIL = 2;

    public abstract int getCodigoPreco();

    public abstract double getValorDoAluguel(int diasAlugado);

    public int getPontosDeAlugadorFrequente(int diasAlugado) {
        return 1;
    }

    public boolean isNull() {
        return false;
    }
}