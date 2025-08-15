package model;

public class Ingresso {
    private String codigo;

    //associações
    private Sessao sessao;

    public Ingresso() {
    }

    public Ingresso(String codigo, Sessao sessao) {
        this.codigo = codigo;
        this.sessao = sessao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    @Override
    public String toString() {
        return "\nIngresso{" +
                "codigo='" + codigo + '\'' +
                ", sessao=" + sessao +
                '}';
    }
}
