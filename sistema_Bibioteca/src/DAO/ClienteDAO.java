package DAO;

import Models.Cliente;

import java.util.ArrayList;

public class ClienteDAO {
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
