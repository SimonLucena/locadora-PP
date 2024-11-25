package org.locadora.objetos;

public abstract class Classificacao {
    abstract int getCodigoPreco();
    abstract double getValorDoAluguel( int diasAlugado );

    int getPontosDeAlugadorFrequente( int diasAlugado ){
        return 1;
    }
}
