package model;

public class ClientePessoaFisica extends Cliente {
    private String cpf;

    public ClientePessoaFisica() {
    }

    public ClientePessoaFisica(int quantidadeDeAcoes, double valorDaAcao, String nome, String sobrenome, String email, String cpf) {
        super(quantidadeDeAcoes, valorDaAcao, nome, sobrenome, email);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "\nClientePessoaFisica{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", valorDaAcao=" + valorDaAcao +
                ", quantidadeDeAcoes=" + quantidadeDeAcoes +
                '}';
    }
}
