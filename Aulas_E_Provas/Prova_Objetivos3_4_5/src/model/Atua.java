package model;

public class Atua {
    private String papel;

    //associações
    private Filme filme;
    private Ator ator;

    public Atua() {
    }

    public Atua(String papel, Filme filme, Ator ator) {
        this.papel = papel;
        this.filme = filme;
        this.ator = ator;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Ator getAtor() {
        return ator;
    }

    public void setAtor(Ator ator) {
        this.ator = ator;
    }

    @Override
    public String toString() {
        return "\nAtua{" +
                "papel='" + papel + '\'' +
                ", filme=" + filme +
                ", ator=" + ator +
                '}';
    }
}
