import DAO.ClienteDAO;
import DAO.EmprestimoDAO;
import DAO.FuncionarioDAO;
import DAO.LivroDAO;
import Model.Cliente;
import Model.Emprestimo;
import Model.Funcionario;
import Model.Livro;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<ClienteDAO> clienteDAOS = new ArrayList<>();
        ArrayList<LivroDAO> livroDAOS = new ArrayList<>();
        ArrayList<EmprestimoDAO> emprestimoDAOS = new ArrayList<>();
        ArrayList<FuncionarioDAO> funcionarioDAOS = new ArrayList<>();

        System.out.println("-----------Sistema de Biblioteca------------------------");

        Livro livro = new Livro("Hoobit","Tolkien",150);
        Livro livro2 = new Livro("Romeu e Julieta","Shakespiere",200);

        LivroDAO livroDAO = new LivroDAO();
        livroDAO.criarLivro(livro);
        livroDAO.criarLivro(livro2);
        livroDAO.atualizarLivro("Hoobit","A culpa e das estrelas"
                ,"jacobson",120);
        livroDAO.listarLivros();


        System.out.println("-------------------------------------------------------");

        Cliente cliente = new Cliente("Maicon","1478632",18,"rua dos alfeneiros",
                "sao joao");
        Cliente cliente2 = new Cliente("SIbila","56458456",20,"rua dos comercios",
                "sao paulo");
        Cliente cliente3 = new Cliente("Marcola","545661561",18,"rua dos fazendeiros",
                "Rio de Janeiro");


        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.criarCliente(cliente);
        clienteDAO.criarCliente(cliente2);
        clienteDAO.criarCliente(cliente3);
        clienteDAO.atualizarCliente("Maicon","SHIRLEY",36,"rua baltimore",
               "Sao paulo");
        clienteDAO.deletarCliente("SHIRLEY");
        clienteDAO.listarClientes();

        System.out.println("-------------------------------------------------------");

        Emprestimo emprestimo = new Emprestimo("Romeu e Julieta","SIbila","17-03-2023","12-05-2023");
        Emprestimo emprestimo2 = new Emprestimo("A culpa e das estrelas","SHIRLEY","17-03-2023","10-04-2023");


        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        emprestimoDAO.criarEmprestimo(emprestimo);
        emprestimoDAO.criarEmprestimo(emprestimo2);
        emprestimoDAO.atualizarEmprestimo();
        emprestimoDAO.deletarEmprestimo();
        emprestimoDAO.listarEmprestimo();

        System.out.println("-------------------------------------------------------");

        Funcionario funcionario = new Funcionario("Joao","45614561158","10-02-2023");
        Funcionario funcionario2 = new Funcionario("Gerlandia","15611556456","10-01-2023");


        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.criarFuncionario(funcionario);
        funcionarioDAO.criarFuncionario(funcionario2);
        funcionarioDAO.atualizarFuncionario("45614561158","Marcos","09-02-2023");
        funcionarioDAO.deletarFuncionario("Gerlandia");
        funcionarioDAO.listarFuncionario();

        System.out.println("-------------------------------------------------------");




    }
}
