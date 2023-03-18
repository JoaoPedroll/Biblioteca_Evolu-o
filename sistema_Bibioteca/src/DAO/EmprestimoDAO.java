package DAO;

import Model.Emprestimo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmprestimoDAO {

    public EmprestimoDAO() {

    }

    List<Emprestimo> emprestimos = new ArrayList<>();

    public void criarEmprestimo(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
    }
    public void atualizarEmprestimo(String livro,String novoLivro,String novoCliente
            , String novaDataEmprestimo, String novaDataDevolucao){
        boolean encontrado = false;
        for (Emprestimo emprestimo : emprestimos){
            if(Objects.equals(emprestimo.getLivro(), livro)){
                emprestimo.setLivro(novoLivro);
                emprestimo.setCliente(novoCliente);
                emprestimo.setData_emprestimo(novaDataEmprestimo);
                emprestimo.setData_devolucao(novaDataDevolucao);
                System.out.println("Atualização Concluida!");
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("Atualização NÃO Conlcuida, Emprestimo não existe!!");
        }
    }
    public void deletarEmprestimo(String nomeLivro){
        for (Emprestimo emp : emprestimos){
            if(Objects.equals(emp.getLivro(), nomeLivro)){
                emprestimos.remove(emp);
                break;
            }
        }
    }

    public void listarEmprestimo(){
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
