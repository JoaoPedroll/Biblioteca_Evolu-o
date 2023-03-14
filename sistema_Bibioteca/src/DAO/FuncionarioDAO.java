package DAO;

import Models.Funcionario;

import java.util.ArrayList;

public class FuncionarioDAO {
    public static void criarFuncionario(String nome, String cpf, String data_contratacao, ArrayList<Funcionario> funcionarios) {
        Funcionario novoFuncionario = new Funcionario(nome, cpf, data_contratacao);
        funcionarios.add(novoFuncionario);
    }

    public static void atualizarFuncionario(String novoNome, String cpf, String nova_data_contratacao, ArrayList<Funcionario> funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCpf() == cpf) {
                funcionario.setNome(novoNome);
                funcionario.setData_contratacao(nova_data_contratacao);
                break;
            }
        }
    }
    public static void deletarFuncionario(String cpf, ArrayList<Funcionario> funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCpf() == cpf) {
                funcionarios.remove(funcionario);
                break;
            }
        }
    }


    public static void listarFuncionario(ArrayList<Funcionario> funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("CPF: " + funcionario.getCpf() + ", Nome: " + funcionario.getNome() + ", Data de Contratação: " + funcionario.getData_contratacao());
        }
    }
}
