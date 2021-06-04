package br.ufpb.dcx.aps.atividades.composicaosimples.pessoa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {


    @Test
    void testComposicaoSimples() {
        Pessoa p1 = new Pessoa("Pessoa 1");
        Pessoa p2 = new Pessoa("Pessoa 2");
        p1.setFilho(p2);
        assertEquals(p2,p1.getFilho());

        p1.getFilho().setFilho(new Pessoa("Pessoa 3"));
        p1.getFilho().getFilho().setFilho(new Pessoa("Pessoa 4"));
        assertEquals("( eu: Pessoa 1, filho:( eu: Pessoa 2, filho:( eu: Pessoa 3, filho:( eu: Pessoa 4))))",p1.getFamilia());
    }
}
