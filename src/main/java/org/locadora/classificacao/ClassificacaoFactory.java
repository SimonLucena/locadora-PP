package org.locadora.classificacao;

import org.locadora.classificacao.Classificacao;

public class ClassificacaoFactory {

    public static Classificacao create(int codigoClassificacao) {
        return switch (codigoClassificacao) {
            case Classificacao.INFANTIL -> new ClassificacaoInfantil();
            case Classificacao.NORMAL -> new ClassificacaoNormal();
            case Classificacao.LANÇAMENTO -> new ClassificacaoLancamento();
            default -> new ClassificacaoNull();
        };
    }
}
