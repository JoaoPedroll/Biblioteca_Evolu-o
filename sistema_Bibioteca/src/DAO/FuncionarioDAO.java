package DAO;

import Model.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {

    public FuncionarioDAO() {

    }

    static List<Funcionario> funcionarios = new ArrayList<>();

    public  void criarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public  void atualizarFuncionario(String cpf, String novoNome, String nova_Data_Contratacao) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCpf() == cpf) {
                funcionario.setNome(novoNome);
                funcionario.setData_contratacao(nova_Data_Contratacao);
                break;
            }
        }
    }
    public  void deletarFuncionario(String cpf) {
        for (Funcionario func : funcionarios) {
            if (func.getCpf() == cpf) {
                funcionarios.remove(func);
                break;
            }
        }
    }


    public List<Funcionario> listarFuncionario() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("CPF: " + funcionario.getCpf() +
                    ", Nome: " + funcionario.getNome() +
                    ", Data de Contratação: " + funcionario.getData_contratacao());
        }
        return funcionarios;
    }
}
