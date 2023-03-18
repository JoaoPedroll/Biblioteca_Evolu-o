import DAO.ClienteDAO;
import DAO.EmprestimoDAO;
import DAO.FuncionarioDAO;
import DAO.LivroDAO;
import Model.Cliente;
import Model.Emprestimo;
import Model.Funcionario;
import Model.Livro;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Main {
    public static void main(String[] args) {
        boolean run = true;
        while(run) {
            try {
                Scanner input = new Scanner(System.in);
                int opcao = -1;

                while (opcao != 0) {
                    System.out.print("""
                                
                            >>>SISTEMA DA BIBLIOTECA<<<
                                                    
                            Selecione uma opção:\s
                            1 - Gerenciar Funcionários
                            2 - Gerenciar Clientes
                            3 - Gerenciar Livros
                            4 - Gerenciar Empréstimos
                            0 - Sair
                            >>:\s""");

                    opcao = input.nextInt();

                    switch (opcao) {
                        case 1 -> gerenciarFuncionarios();
                        case 2 -> gerenciarClientes();
                        case 3 -> gerenciarLivros();
                        case 4 -> gerenciarEmprestimos();
                        case 0 -> {
                            System.out.println("Encerrando o programa...");
                            run = false;
                        }
                        default -> System.out.println("Opção inválida!");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada Incorreta!!");
            }
        }
    }

    public static void gerenciarFuncionarios() {
        try {
            Scanner input = new Scanner(System.in);
            int opcao = -1;

            FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

            while (opcao != 0) {
                System.out.print("""
    
                        Gerenciamento de Funcionários
                        Selecione uma opção:\s
                        1 - Cadastrar Funcionário
                        2 - Atualizar Funcionário
                        3 - Deletar Funcionário
                        4 - Listar Funcionários
                        0 - Voltar
                        >>:\s""");

                opcao = input.nextInt();

                Scanner input2 = new Scanner(System.in);

                switch (opcao) {
                    case 1 -> {
                        System.out.println("Digite o CPF do funcionário:");
                        String cpf = input2.next();
                        System.out.println("Digite o nome do funcionário:");
                        String nome = input2.next();
                        System.out.println("Digite a data de contratação do funcionário:");
                        String dataContratacao = input2.next();
                        Funcionario funcionario = new Funcionario(nome, cpf, dataContratacao);
                        funcionarioDAO.criarFuncionario(funcionario);
                    }
                    case 2 -> {
                        System.out.println("Digite o CPF do funcionário a ser atualizado:");
                        String cpf = input2.next();
                        System.out.println("Digite o novo nome do funcionário:");
                        String novoNome = input2.next();
                        System.out.println("Digite a nova data de contratação do funcionário:");
                        String dataContratacao = input2.next();
                        funcionarioDAO.atualizarFuncionario(cpf, novoNome, dataContratacao);
                        System.out.println("Atualização Concluida!!");
                    }
                    case 3 -> {
                        System.out.println("Digite o CPF do funcionário a ser deletado:");
                        String delcpf = input2.next();
                        funcionarioDAO.deletarFuncionario(delcpf);
                        System.out.println("Delete Concluido!!");
                    }
                    case 4 -> {
                        funcionarioDAO.listarFuncionario();
                    }
                    case 0 -> System.out.println("Voltando ao menu principal...");
                    default -> System.out.println("Opção inválida!");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada Incorreta!!");
        }
    }

    public static void gerenciarClientes() {
        Scanner input = new Scanner(System.in);
        int opcao = -1;
        Scanner input2 = new Scanner(System.in);

        ClienteDAO clienteDAO = new ClienteDAO();

        while (opcao != 0) {

            System.out.print("""
    
                        Gerenciamento de Clientes
                        Selecione uma opção:\s
                        1 - Cadastrar Cliente
                        2 - Atualizar Cliente
                        3 - Deletar Cliente
                        4 - Listar Cliente
                        0 - Voltar
                        >>:\s""");

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do cliente:");
                    String nome = input2.nextLine();
                    System.out.println("Digite o CPF do cliente:");
                    String cpf = input2.nextLine();
                    System.out.println("Digite a idade do cliente:");
                    String idade = input2.nextLine();
                    System.out.println("Digite a rua do cliente:");
                    String rua = input2.nextLine();
                    System.out.println("Digite a cidade do cliente:");
                    String cidade = input2.nextLine();
                    int intIdade = parseInt(idade);
                    Cliente cliente = new Cliente(nome, cpf, intIdade, rua, cidade);
                    clienteDAO.criarCliente(cliente);
                    break;
                case 2:
                    System.out.println("Digite o nome do cliente:");
                    nome = input2.nextLine();
                    System.out.println("Digite o novo nome do cliente:");
                    String novoNome = input2.nextLine();
                    System.out.println("Digite a nova idade do cliente:");
                    idade = input2.nextLine();
                    System.out.println("Digite a nova rua do cliente:");
                    rua = input2.nextLine();
                    System.out.println("Digite a nova cidade do cliente:");
                    cidade = input2.nextLine();
                    intIdade = parseInt(idade);
                    clienteDAO.atualizarCliente(nome, novoNome, intIdade, rua, cidade);
                    break;
                case 3:
                    System.out.println("Digite o CPF do cliente a ser deletado:");
                    cpf = input2.nextLine();
                    clienteDAO.deletarCliente(cpf);
                    break;
                case 4:
                    clienteDAO.listarClientes();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    public static void gerenciarLivros() {
        Scanner input = new Scanner(System.in);
        int opcao = -1;

        LivroDAO livroDAO = new LivroDAO();

        while (opcao != 0) {
            System.out.print("""
    
                        Gerenciamento de Livros
                        Selecione uma opção:\s
                        1 - Cadastrar Livro
                        2 - Atualizar Livro
                        3 - Deletar Livro
                        4 - Listar Livro
                        0 - Voltar
                        >>:\s""");

            opcao = input.nextInt();

            Scanner input2 = new Scanner(System.in);

            switch (opcao) {
                case 1:
                    System.out.println("Digite o ISBN do livro:");
                    String isbn = input2.nextLine();
                    System.out.println("Digite o título do livro:");
                    String titulo = input2.nextLine();
                    System.out.println("Digite o nome do autor do livro:");
                    String autor = input2.nextLine();
                    System.out.println("Digite o número de páginas do livro:");
                    int numPaginas = input2.nextInt();
                    Livro livro = new Livro(isbn, titulo, autor, numPaginas);
                    livroDAO.criarLivro(livro);
                    break;
                case 2:
                    System.out.println("Digite o ISBN do livro a ser atualizado:");
                    isbn = input2.nextLine();
                    System.out.println("Digite o novo título do livro:");
                    String novoTitulo = input2.nextLine();
                    System.out.println("Digite o novo autor do livro:");
                    String novoAutor = input2.nextLine();
                    System.out.println("Digite o novo número de páginas do livro:");
                    int novoNumPaginas = input2.nextInt();
                    livroDAO.atualizarLivro(isbn, novoTitulo, novoAutor, novoNumPaginas);
                    break;
                case 3:
                    System.out.println("Digite o ISBN do livro a ser deletado:");
                    isbn = input2.nextLine();
                    livroDAO.deletarLivro(isbn);
                    break;
                case 4:
                    livroDAO.listarLivros();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    public static void gerenciarEmprestimos() {
        Scanner input = new Scanner(System.in);
        int opcao = -1;
        EmprestimoDAO emprestimoDAO = new EmprestimoDAO();

        Scanner input2 = new Scanner(System.in);

        while (opcao != 0) {

            System.out.print("""
    
                        Gerenciamento de Empréstimos
                        Selecione uma opção:\s
                        1 - Cadastrar Empréstimo
                        2 - Atualizar Empréstimo
                        3 - Deletar Empréstimo
                        4 - Listar Empréstimo
                        0 - Voltar
                        >>:\s""");

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o título do livro:");
                    String titulo = input2.nextLine();
                    System.out.println("Digite o CPF do cliente:");
                    String nomeCliente = input2.nextLine();
                    System.out.println("Digite a data do emprestimo:");
                    String data_emprestimo = input2.nextLine();
                    System.out.println("Digite a data da devolução:");
                    String data_devolucao = input2.nextLine();
                    Emprestimo novoEmprestimo = new Emprestimo(titulo, nomeCliente, data_emprestimo, data_devolucao);
                    emprestimoDAO.criarEmprestimo(novoEmprestimo);
                    break;
                case 2:
                    System.out.println("Digite o título do livro:");
                    titulo = input2.nextLine();
                    System.out.println("Digite o novo título do livro:");
                    String novoTitulo = input2.nextLine();
                    System.out.println("Digite o novo cliente do livro:");
                    String novoCliente = input2.nextLine();
                    System.out.println("Digite a nova data de emprestimo do livro:");
                    String novaDataEmprestimo = input2.nextLine();
                    System.out.println("Digite a nova data de devolução do livro:");
                    String novaDataDevolucao = input2.nextLine();
                    emprestimoDAO.atualizarEmprestimo(titulo, novoTitulo, novoCliente, novaDataEmprestimo, novaDataDevolucao);
                    break;
                case 3:
                    System.out.println("Digite o título do livro a ser deletado:");
                    titulo = input2.nextLine();
                    emprestimoDAO.deletarEmprestimo(titulo);
                    break;
                case 4:
                    emprestimoDAO.listarEmprestimo();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
