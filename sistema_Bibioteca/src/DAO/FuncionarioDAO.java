package DAO;

import Model.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FuncionarioDAO {

    public FuncionarioDAO() {

    }

    static List<Funcionario> funcionarios = new ArrayList<>();

    public  void criarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public  void atualizarFuncionario(String cpf, String novoNome, String nova_Data_Contratacao) {
        boolean encontrado = false;
        for (Funcionario funcionario : funcionarios) {
            if (Objects.equals(funcionario.getCpf(), cpf)) {
                funcionario.setNome(novoNome);
                funcionario.setData_contratacao(nova_Data_Contratacao);
                System.out.println("Atualização Concluida!");
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("Atualização NÃO Conlcuida!!");
        }
    }
    public  void deletarFuncionario(String cpf) {
        for (Funcionario func : funcionarios) {
            if (Objects.equals(func.getCpf(), cpf)) {
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
