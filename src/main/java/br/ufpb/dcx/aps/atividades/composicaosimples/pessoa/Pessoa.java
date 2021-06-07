package br.ufpb.dcx.aps.atividades.composicaosimples.pessoa;

public class Pessoa {
    private String pessoa;
    private Pessoa filho;

    public Pessoa(){
        this.pessoa = "";
    }
    public Pessoa(String pessoa){
        this.pessoa = pessoa;
    }

    public String getPessoa() {

        return pessoa;
    }

    public void setPessoa(String pessoa) {

        this.pessoa = pessoa;
    }

    public Pessoa getFilho() {

        return filho;
    }

    public void setFilho(Pessoa filho) {

        this.filho = filho;
    }

    public String getFamilia() {
        if (this.filho == null){
            return "( eu: "+pessoa+")";
        }else {
            return "( eu: "+pessoa+ ", filho:"+filho.getFamilia()+")";
        }
    }
}
