package org.locadora.interfaces;

public interface AlugavelIntf {
    public String getTitulo();
    public double getValorDvd(int diasAlugado);
    public int getPontosDeAlugadorFrequente(int diasAlugado);
}
