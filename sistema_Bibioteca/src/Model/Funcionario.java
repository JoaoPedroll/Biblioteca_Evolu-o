package Models;

import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private String cpf;
    private String data_contratacao;

    public Funcionario(String nome, String cpf, String data_contratacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_contratacao = data_contratacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_contratacao() {
        return data_contratacao;
    }

    public void setData_contratacao(String data_contratacao) {
        this.data_contratacao = data_contratacao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", data_contratacao='" + data_contratacao + '\'' +
                '}';
    }


}
