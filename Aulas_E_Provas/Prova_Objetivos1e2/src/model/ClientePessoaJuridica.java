package model;

public class ClientePessoaJuridica extends Cliente{
    private String cnpj;

    public ClientePessoaJuridica() {
    }

    public ClientePessoaJuridica(int quantidadeDeAcoes, double valorDaAcao, String nome, String sobrenome, String email, String cnpj) {
        super(quantidadeDeAcoes, valorDaAcao, nome, sobrenome, email);
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
                ", email='" + email + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", valorDaAcao=" + valorDaAcao +
                ", quantidadeDeAcoes=" + quantidadeDeAcoes +
                '}';
    }
}
