package DAO;

import Models.Emprestimo;

import java.util.ArrayList;

public class EmprestimoDAO {

    public static void criarEmprestimo(String livro, String cliente, String data_emprestimo,
                                       String data_devolucao, ArrayList<Emprestimo> emprestimos){
        Emprestimo emprestimo = new Emprestimo(livro,cliente,data_emprestimo,data_devolucao);
        emprestimos.add(emprestimo);
    }
    public static void atualizarEmprestimo(String livro,String novoLivro,String novoCliente
            , String novaDataEmprestimo, String novaDataDevolucao, ArrayList<Emprestimo> emprestimos){
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
    public static void deletarEmprestimo(String nomeLivro, ArrayList<Emprestimo> emprestimos){
        for (Emprestimo emp : emprestimos){
            if(emp.getLivro() == nomeLivro){
                emprestimos.remove(emp);
                break;
            }
        }
    }

    public static void listarEmprestimo(ArrayList<Emprestimo> emprestimos){
        for (Emprestimo emprestimo : emprestimos){
            System.out.println("Emprestimo{ "+ "Livro: " + emprestimo.getLivro() +"Cliente: "+ emprestimo.getCliente() +", Data de Emprestimo: " + emprestimo.getData_emprestimo() + ", Data de Devolução: " + emprestimo.getData_devolucao());
        }
    }
}
