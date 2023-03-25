package Model;

import java.util.ArrayList;

public class Funcionario extends Pessoa{
    private String data_contratacao;

    public Funcionario(String nome, String cpf, String data_contratacao) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.data_contratacao = data_contratacao;
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
                "nome='" + super.getNome() + '\'' +
                ", cpf='" + super.getCpf() + '\'' +
                ", data_contratacao='" + data_contratacao + '\'' +
                '}';
    }


}
