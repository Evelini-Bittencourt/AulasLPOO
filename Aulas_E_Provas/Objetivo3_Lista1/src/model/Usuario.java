package model;

import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private String telefone;

    //associação entre as classes
    //associação binária
    private List<Corrida> corridas;
    //Perguntar sobre isso: private List<Corrida> corridas = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Corrida> getCorridas() {
        return corridas;
    }

    public void setCorridas(List<Corrida> corridas) {
        this.corridas = corridas;
    }

    @Override
    public String toString() {
        return "\nUsuario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
