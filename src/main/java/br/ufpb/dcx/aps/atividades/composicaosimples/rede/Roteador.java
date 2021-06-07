package br.ufpb.dcx.aps.atividades.composicaosimples.rede;

import java.util.*;

public class Roteador extends Elemento {

    private List<Elemento> componentes = new LinkedList<>();

    public Roteador(String nome, String id, String mac) {
        super(nome, id, mac);
    }
    public void addComponente(Elemento x) {
        componentes.add(x);

    }

    public List<Elemento> getComponentes(){

        return componentes;
    }

}
