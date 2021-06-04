package br.ufpb.dcx.aps.atividades.composicaosimples.rede;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComposicaoRedeTest {


    @Test
    void testComposicaoRede() {

        // Todos os parâmetros dos construtores são: nome, IP e endereço MAC
        Notebook notebook = new Notebook("Dell 123", "127.0.0.1", "00:33:22:11:22");
        Roteador roteador = new Roteador("TP-Link 123","192.221.111.22","44:44:33:33:33");

        roteador.addComponente(notebook);


        // o método getComponentes() na classe Roteador, retorna um List
        assertEquals(notebook,roteador.getComponentes().get(0));

        Roteador cisco = new Roteador("Cisco","127.2.3.4","44:44:33:33:33");
        Celular celular = new Celular("Android Samsung","192.78.21.21", "33:22:33:22:33");
        Notebook notebook2 = new Notebook("Dell 444", "127.2.32.1", "00:33:22:11:22");

        cisco.addComponente(celular);
        cisco.addComponente(notebook2);

        assertEquals(celular,cisco.getComponentes().get(0));
        assertEquals(notebook2,cisco.getComponentes().get(1));
        roteador.addComponente(cisco);
        assertEquals(cisco,roteador.getComponentes().get(1));

    }
}
