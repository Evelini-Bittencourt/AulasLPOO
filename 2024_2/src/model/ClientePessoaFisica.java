package model;

public class ClientePessoaFisica extends Cliente{
    private String cpf;

    public ClientePessoaFisica() {
    }

    public ClientePessoaFisica(String nome, String sobrenome, String email, double valorDaAcao, int quantidadeDeAcoes, String cpf) {
        super(nome, sobrenome, email, valorDaAcao, quantidadeDeAcoes);
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
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", valorDaAcao=" + valorDaAcao +
                ", quantidadeDeAcoes=" + quantidadeDeAcoes +
                '}';
    }
}
