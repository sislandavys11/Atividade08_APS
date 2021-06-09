package br.ufpb.dcx.aps.atividades.composicaosimples.rede;

import java.util.*;

public class Roteador extends ComponenteRede {

    private List<ComponenteRede> componentes = new LinkedList<>();

    public Roteador(String nome, String id, String mac) {
        super(nome, id, mac);
    }
    public void addComponente(ComponenteRede x) {
        componentes.add(x);

    }

    public List<ComponenteRede> getComponentes(){

        return componentes;
    }

}
