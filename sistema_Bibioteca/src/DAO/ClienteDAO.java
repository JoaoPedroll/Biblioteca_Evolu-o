package DAO;

import Models.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    public ClienteDAO() {

    }

    static List<Models.Cliente> clientes = new ArrayList<>();

    public static void criarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public static void atualizarCliente(String nome, String novoNome ,int novaIdade, String novaRua, String novaCidade) {
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
    public static void deletarCliente(String nome, Cliente cliente) {
        for (Cliente cli : clientes) {
            if (cliente.getNome() == nome) {
                clientes.remove(cliente);
                break;
            }
        }
    }


    public static void listarClientes(ArrayList<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            System.out.println("Cpf: " + cliente.getCpf() +
                    ", Nome: " + cliente.getNome() +
                    ", Idade: " + cliente.getIdade() +
                    ", Rua: " + cliente.getRua() + ", Cidade: " + cliente.getCidade());
        }
    }
}
