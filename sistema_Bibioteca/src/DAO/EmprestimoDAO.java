package DAO;

import Models.Emprestimo;

import java.util.ArrayList;
import java.util.List;

public class EmprestimoDAO {

    public EmprestimoDAO() {

    }

    static List<Models.Emprestimo> emprestimos = new ArrayList<>();

    public static void criarEmprestimo(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
    }
    public static void atualizarEmprestimo(String livro,String novoLivro,String novoCliente
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
    public static void deletarEmprestimo(String nomeLivro, Emprestimo emprestimo){
        for (Emprestimo emp : emprestimos){
            if(emp.getLivro() == nomeLivro){
                emprestimos.remove(emp);
                break;
            }
        }
    }

    public static void listarEmprestimo(ArrayList<Emprestimo> emprestimos){
        for (Emprestimo emprestimo : emprestimos){
            System.out.println("Emprestimo{ "+ "Livro: " +
                    emprestimo.getLivro() +"Cliente: "+
                    emprestimo.getCliente() +
                    ", Data de Emprestimo: "
                    + emprestimo.getData_emprestimo() +
                    ", Data de Devolução: " + emprestimo.getData_devolucao());
        }
    }
}
