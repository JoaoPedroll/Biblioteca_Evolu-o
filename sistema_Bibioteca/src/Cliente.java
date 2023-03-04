import java.util.ArrayList;

public class Cliente {
    private String nome;
    private static String cpf;
    private int idade;
    private String rua;
    private String cidade;

    public Cliente(String nome,String cpf, int idade, String rua, String cidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.rua = rua;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", rua='" + rua + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }

    public static void criarCliente(String nome, String cpf, int idade, String rua, String cidade, ArrayList<Cliente> clientes) {
        Cliente novoCliente = new Cliente(nome, cpf, idade, rua, cidade);
        clientes.add(novoCliente);
    }

    public static void atualizarCliente(String nome, String novoNome ,int novaIdade, String novaRua, String novaCidade, ArrayList<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome() == nome) {
                cliente.setNome(novoNome);
                cliente.setIdade(novaIdade);
                cliente.setRua(novaRua);
                cliente.setCidade(novaCidade);
                break;
            }
        }
    }
    public static void deletarCliente(String nome, ArrayList<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome() == nome) {
                clientes.remove(cliente);
                break;
            }
        }
    }


    public static void listarClientes(ArrayList<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            System.out.println("Cpf: " + cliente.getCpf() + ", Nome: " + cliente.getNome() + ", Idade: " + cliente.getIdade() + ", Rua: " + cliente.getRua() + ", Cidade: " + cliente.getCidade());
        }
    }
}
