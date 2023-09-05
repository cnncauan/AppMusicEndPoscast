package br.com.alura.minhasmusicas.Modelos;

public class Audio {
    private String titulo;
    private int classificacao;
    private int totalDeReproducoes;
    private int totalCurtida;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalCurtida() {
        return totalCurtida;
    }

    public void curte(){
        this.totalCurtida++;
    }

    public void curtida(){
        this.totalCurtida++;
    }


}
