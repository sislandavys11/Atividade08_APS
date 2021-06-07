package br.ufpb.dcx.aps.atividades.composicaosimples.rede;

public class Elemento {
    private String nome;
    private String id;
    private String mac;

    public Elemento(String nome, String id, String mac) {
        this.nome = nome;
        this.id = id;
        this.mac = mac;
    }

    public String getId() {
        return id;
    }
}
