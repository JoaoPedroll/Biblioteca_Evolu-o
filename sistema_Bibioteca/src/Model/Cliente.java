package Model;
import java.util.ArrayList;

public class Cliente extends Pessoa{

    private int idade;
    private String rua;
    private String cidade;

    public Cliente(String nome,String cpf, int idade, String rua, String cidade) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.idade = idade;
        this.rua = rua;
        this.cidade = cidade;
    }



    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }



    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + super.getNome() + '\'' +
                ", cpf='" + super.getCpf() + '\'' +
                ", idade=" + idade +
                ", rua='" + rua + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }


}
