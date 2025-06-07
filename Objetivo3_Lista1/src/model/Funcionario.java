package model;

import java.time.LocalDateTime;
import java.util.List;

public class Funcionario {
    private Long id;
    private String cpf;
    private String nome;
    private String sobrenome;
    private LocalDateTime dataDeNascimento;

    //associação entre as classes
    //composição
    //quando é composição só se coloca a associação do lado forte


    public Funcionario() {
    }

    public Funcionario(Long id, String cpf, String nome, String sobrenome, LocalDateTime dataDeNascimento) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDateTime getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDateTime dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "\nFuncionario{" +
                "id=" + id +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                '}';
    }
}
