package org.locadora.objetos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {
    private final String nome;
    private final List<Aluguel> dvdsAlugados = new ArrayList<Aluguel>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        dvdsAlugados.add(aluguel);
    }

    public double getValorTotal() {
        double valorTotal = 0.0;
        for (Aluguel aluguel : dvdsAlugados) {
            valorTotal += aluguel.getValorAluguel();
        }
        return valorTotal;
    }

    public int getPontosTotaisDeAlugadorFrequente() {
        int pontosTotais = 0;
        for (Aluguel aluguel : dvdsAlugados) {
            pontosTotais += aluguel.calcularPontosDeAluguel();
        }
        return pontosTotais;
    }

    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        Iterator<Aluguel> alugueis = dvdsAlugados.iterator();
        String resultado = "Registro de Alugueis de " + getNome() + fimDeLinha;

        while(alugueis.hasNext()) {
            Aluguel cada = alugueis.next();
            // mostra valores para este aluguel
            resultado += "\t" + cada.getDVD().getTitulo() + "\t R$ " + cada.getValorAluguel() + fimDeLinha;
        } // while

        // adiciona rodapé
        resultado += "Valor total pago: R$ " + getValorTotal() + fimDeLinha;
        resultado += "Voce acumulou " + getPontosTotaisDeAlugadorFrequente() +
                " pontos de alugador frequente";
        return resultado;
    }

    public String extratoHTML() {
        final String fimDeLinha = System.lineSeparator();
        Iterator<Aluguel> alugueis = dvdsAlugados.iterator();
        String resultado = "<H1>Registro de Alugueis de <EM>" + getNome() +
                "</EM></H1><P>" + fimDeLinha;
        while(alugueis.hasNext()) {
            Aluguel cada = alugueis.next();
            resultado += cada.getDVD().getTitulo() + ": R$ " + cada.getValorAluguel() + "<BR>"+ fimDeLinha;
        } // while
        // adiciona rodapé
        resultado += "<P>Valor total pago: <EM>R$ " + getValorTotal() +
                "</EM>"+ fimDeLinha;
        resultado += "<P>Voce acumulou <EM>" +
                getPontosTotaisDeAlugadorFrequente() +
                " pontos </EM> de alugador frequente";
        return resultado;
    }
}