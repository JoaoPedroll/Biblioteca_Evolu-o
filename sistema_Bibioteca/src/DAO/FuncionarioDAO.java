package DAO;

import Models.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {

    public FuncionarioDAO() {

    }

    static List<Models.Funcionario> funcionarios = new ArrayList<>();

    public static void criarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public static void atualizarFuncionario(String cpf, String novoNome, String nova_Data_Contratacao) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCpf() == cpf) {
                funcionario.setNome(novoNome);
                funcionario.setData_contratacao(nova_Data_Contratacao);
                break;
            }
        }
    }
    public static void deletarFuncionario(String cpf, Funcionario funcionario) {
        for (Funcionario func : funcionarios) {
            if (funcionario.getCpf() == cpf) {
                funcionarios.remove(funcionario);
                break;
            }
        }
    }


    public static void listarFuncionario(ArrayList<Funcionario> funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("CPF: " + funcionario.getCpf() +
                    ", Nome: " + funcionario.getNome() +
                    ", Data de Contratação: " + funcionario.getData_contratacao());
        }
    }
}
