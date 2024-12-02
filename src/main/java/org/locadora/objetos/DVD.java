package org.locadora.objetos;

import org.locadora.classificacao.*;
import org.locadora.interfaces.AlugavelIntf;

public class DVD implements AlugavelIntf {
    private String titulo;
    private Classificacao classificacao;


    public DVD(String titulo, int codigoDePreco) {
        this.titulo = titulo;
        setCódigoDePreço(codigoDePreco);
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public Classificacao getClassificacao() {
        return classificacao;
    }

    public int getCodigoDePreco() {
        return classificacao.getCodigoPreco();
    }

    public void setCódigoDePreço(int codigoDePreco) {
        classificacao = ClassificacaoFactory.create(codigoDePreco);
    }

    @Override
    public double getValorAluguel(int diasAlugado) {
        return classificacao.getValorDoAluguel(diasAlugado);
    }

    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugado) {

        return classificacao.getPontosDeAlugadorFrequente(diasAlugado);
    }
}
