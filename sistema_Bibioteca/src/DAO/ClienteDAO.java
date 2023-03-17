package DAO;

import Model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {


    List<Cliente> clientes = new ArrayList<>();


    public void criarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void atualizarCliente(String nome, String novoNome ,
                                  int novaIdade, String novaRua, String novaCidade) {
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
    public void deletarCliente(String nome) {
        for (Cliente cli : clientes) {
            if (cli.getNome() == nome) {
                clientes.remove(cli);
                break;
            }
        }
    }


    public List<Cliente> listarClientes() {
        for (Cliente cli : clientes) {
            System.out.println("Cpf: " + cli.getCpf() +
                    ", Nome: " + cli.getNome() +
                    ", Idade: " + cli.getIdade() +
                    ", Rua: " + cli.getRua() + ", Cidade: " + cli.getCidade());
        }
        return clientes;
    }
}
