package org.locadora;

//********** import para executar o código conforme modificações da lista01.2.1-GRASP-refactoring
import org.locadora.classificacao.Classificacao;
import org.locadora.objetos.Aluguel;
import org.locadora.objetos.Cliente;
import org.locadora.objetos.DVD;
//********** import para executar o código conforme modificações da lista01.2.2-GRASP-refactoring
//import refactoring1.Cliente;
//************************************************************************************************
//********** import para executar o código conforme modificações da lista01.2.3-GRASP-refactoring
//import refactoring2.Cliente;
//import refactoring2.Aluguel;
//************************************************************************************************


public class Locadora {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Alex Sandro");

        c1.adicionaAluguel(new Aluguel(new DVD("O Atirador", Classificacao.NORMAL), 10));
        c1.adicionaAluguel(new Aluguel(new DVD("Luca", Classificacao.INFANTIL), 2));
        c1.adicionaAluguel(new Aluguel(new DVD("O Gato de Botas 2", Classificacao.LANÇAMENTO), 30));
        c1.adicionaAluguel(new Aluguel(new DVD("Arremessando Alto", Classificacao.LANÇAMENTO), 4));
        c1.adicionaAluguel(new Aluguel(new DVD("Moana", Classificacao.INFANTIL), 10));
        c1.adicionaAluguel(new Aluguel(new DVD("Uma Noite no Museu", 0), 3));
        c1.adicionaAluguel(new Aluguel(new DVD("TESTE", 12), 3));

        System.out.println(c1.extrato());
//        System.out.println(c1.extratoHTML());
    }
}
