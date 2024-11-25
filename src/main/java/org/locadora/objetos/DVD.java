package org.locadora.objetos;

import org.locadora.interfaces.AlugavelIntf;

public class DVD implements AlugavelIntf {
    public static final int NORMAL = 0;
    public static final int LANÇAMENTO = 1;
    public static final int INFANTIL = 2;

//    public static final Classificacao classificacao;

    private final String titulo;
    private int codigoDePreco;

    public DVD(String titulo, int codigoDePreco) {
        this.titulo = titulo;
        this.codigoDePreco = codigoDePreco;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    public int getCodigoDePreco() {
        return codigoDePreco;
    }

    public void setCodigoDePreco(int codigoDePreco) {
        this.codigoDePreco = codigoDePreco;
    }

    @Override
    public double getValorDvd(int diasAlugado) {
        double valorDvd = 0.0;

        // determina valor do item
        switch(getCodigoDePreco()) {
            case DVD.NORMAL: // R$ 2.00 por 2 dias. O dia adicional acrescenta R$ 1.50
                valorDvd += 2.0;
                if(diasAlugado > 2) {
                    valorDvd +=(diasAlugado - 2) * 1.5;
                }
                break;

            case DVD.LANÇAMENTO: // R$ 3.00 por dia
                valorDvd += diasAlugado * 3.00;
                break;

            case DVD.INFANTIL: // R$ 1.50 por 3 dias. O dia adicional acrescenta R$ 1.50
                valorDvd += 1.5;

                if(diasAlugado > 3) {
                    valorDvd += (diasAlugado - 3) * 1.5;
                }
                break;
        } //switch

        return valorDvd;
    }

    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugado) {
        int pontosDeAlugadorFrequente = 0;
        // trata de pontos de alugador frequente
        pontosDeAlugadorFrequente++;
        // adiciona bonus para aluguel de um lançamento por pelo menos 2 dias
        if(getCodigoDePreco() == DVD.LANÇAMENTO && diasAlugado > 1) {
            pontosDeAlugadorFrequente++;
        }

        return pontosDeAlugadorFrequente;
    }
}
