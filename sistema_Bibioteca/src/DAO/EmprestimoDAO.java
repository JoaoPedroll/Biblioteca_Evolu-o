package DAO;

import Model.Emprestimo;

import java.util.ArrayList;
import java.util.List;

public class EmprestimoDAO {

    public EmprestimoDAO() {

    }

    List<Emprestimo> emprestimos = new ArrayList<>();

    public void criarEmprestimo(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
    }
    public void atualizarEmprestimo(String livro,String novoLivro,String novoCliente
            , String novaDataEmprestimo, String novaDataDevolucao){
        for (Emprestimo emprestimo : emprestimos){
            if(emprestimo.getLivro() == livro){
                emprestimo.setLivro(novoLivro);
                emprestimo.setCliente(novoCliente);
                emprestimo.setData_emprestimo(novaDataEmprestimo);
                emprestimo.setData_devolucao(novaDataDevolucao);
                break;
            }
        }
    }
    public void deletarEmprestimo(String nomeLivro){
        for (Emprestimo emp : emprestimos){
            if(emp.getLivro() == nomeLivro){
                emprestimos.remove(emp);
                break;
            }
        }
    }

    public List<Emprestimo> listarEmprestimo(){
        for (Emprestimo emprestimo : emprestimos){
            System.out.println("Emprestimo{ "+ "Livro: " +
                    emprestimo.getLivro() +"Cliente: "+
                    emprestimo.getCliente() +
                    ", Data de Emprestimo: "
                    + emprestimo.getData_emprestimo() +
                    ", Data de Devolução: " + emprestimo.getData_devolucao());
        }
        return emprestimos;
    }
}
