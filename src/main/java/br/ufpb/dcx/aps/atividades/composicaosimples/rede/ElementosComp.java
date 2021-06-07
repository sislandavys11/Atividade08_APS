package br.ufpb.dcx.aps.atividades.composicaosimples.rede;

import java.util.LinkedList;
import java.util.List;

public class ElementosComp extends Elemento{
    private List<Elemento> componentes = new LinkedList<>();

    public ElementosComp(String nome, String id, String mac) {
        super(nome, id, mac);
    }

    public void addComponente(Elemento x) {
        componentes.add(x);

    }

    public List<Elemento> getComponentes(){

        return componentes;
    }
}
