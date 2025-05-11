package model;

public class ClientePessoaJuridica extends Cliente{
    private String cnpj;

    public ClientePessoaJuridica() {
    }

    public ClientePessoaJuridica(String nome, String sobrenome, String email, double valorDaAcao, int quantidadeDeAcoes, String cnpj) {
        super(nome, sobrenome, email, valorDaAcao, quantidadeDeAcoes);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "\nClientePessoaJuridica{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", email='" + email + '\'' +
                ", valorDaAcao=" + valorDaAcao +
                ", quantidadeDeAcoes=" + quantidadeDeAcoes +
                '}';
    }
}
