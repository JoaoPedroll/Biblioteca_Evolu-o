import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> livrosBiblioteca = new ArrayList<>();
        ArrayList<Cliente> clientesBilioteca = new ArrayList<>();
        ArrayList<Funcionario> funcionariosBilioteca = new ArrayList<>();
        ArrayList<Emprestimo> emprestimoBiblioteca = new ArrayList<>();

        String[] nomes = {"Livro", "Cliente", "Funcionario", "Emprestimo"};

        Scanner entradaOpcao = new Scanner(System.in);
        System.out.println("---------Sistema de Biblioteca---------");
        while(true){
            try{
                System.out.print("""

                        Opções:\s
                        1- Livro
                        2- Cliente
                        3- Funcionario
                        4- Emprestimo
                        0- Sair da operação

                        Digite um valor:\s""");
                int opcaoExecuta = entradaOpcao.nextInt();
                if(opcaoExecuta == 0){
                    break;
                }else if(opcaoExecuta >= 1 && opcaoExecuta <= 4){
                    String n = nomes[opcaoExecuta - 1];
                    System.out.printf("""

                            Opções de CRUD para %s:\s
                            1- Criar %s
                            2- Listar %s
                            3- Atualizar %s
                            4- Deletar %s
                            0- Sair da operação

                            Digite um valor:\s""", n, n, n, n, n);

                    int opcaoCRUD = entradaOpcao.nextInt();
                    if(opcaoCRUD == 0){
                        break;
                    }else{
                        Scanner entradaVariaveis = new Scanner(System.in);
                        if(opcaoExecuta == 1){
                            if(opcaoCRUD == 1 || opcaoCRUD == 3){
                                System.out.print("Digite o Titulo do Livro: ");
                                String titulo = entradaVariaveis.nextLine();
                                System.out.print("Digite o Autor do Livro: ");
                                String autor = entradaVariaveis.nextLine();
                                System.out.print("Digite o Numero de paginas do Livro: ");
                                int numeroPaginas = entradaVariaveis.nextInt();

                                if(opcaoCRUD == 1){
                                    Livro.criarLivro(titulo, autor, numeroPaginas, livrosBiblioteca);
                                }else{
                                    System.out.print("Digite o Titulo do Livro: ");
                                    String novoTitulo = entradaVariaveis.nextLine();
                                    Livro.atualizarLivro(titulo,novoTitulo, autor, numeroPaginas, livrosBiblioteca);
                                }
                            } else if (opcaoCRUD == 2) {
                                System.out.println("\nListagem de Livros:\n");
                                Livro.listarLivros(livrosBiblioteca);
                            } else{
                                System.out.print("Digite o Titulo do Livro para deletar: ");
                                String titulo = entradaVariaveis.nextLine();
                                Livro.deletarLivro(titulo, livrosBiblioteca);
                            }
                        }else if (opcaoExecuta == 2){
                            if(opcaoCRUD == 1 || opcaoCRUD == 3){
                                System.out.print("Digite o Nome do Cliente: ");
                                String nome = entradaVariaveis.nextLine();
                                System.out.print("Digite o CPF do Cliente: ");
                                String cpf = entradaVariaveis.nextLine();
                                System.out.print("Digite a Idade do Cliente: ");
                                int idade = entradaVariaveis.nextInt();
                                System.out.print("Digite a Rua do Cliente: ");
                                String rua = entradaVariaveis.nextLine();
                                System.out.print("Digite a Cidade do Cliente: ");
                                String cidade = entradaVariaveis.nextLine();

                                if(opcaoCRUD == 1){
                                    Cliente.criarCliente(nome,cpf,idade,rua,cidade, clientesBilioteca);
                                }else{
                                    System.out.print("Digite o novo Nome do Cliente: ");
                                    String novoNome = entradaVariaveis.nextLine();
                                    Cliente.atualizarCliente(nome,novoNome,idade,rua,cidade, clientesBilioteca);
                                }
                            } else if (opcaoCRUD == 2) {
                                System.out.println("\nListagem de Clientes:\n");
                                Cliente.listarClientes(clientesBilioteca);
                            } else{
                                System.out.print("Digite o nome do Cliente para deletar: ");
                                String nome = entradaVariaveis.nextLine();
                                Cliente.deletarCliente(nome, clientesBilioteca);
                            }
                        }else if (opcaoExecuta == 3){
                            if(opcaoCRUD == 1 || opcaoCRUD == 3){
                                System.out.print("Digite o Nome do Funcionario: ");
                                String nome = entradaVariaveis.nextLine();
                                System.out.print("Digite o CPF do Funcionario: ");
                                String cpf = entradaVariaveis.nextLine();
                                System.out.print("Digite a Data de Contratação do Funcionario: ");
                                String dataContratacao = entradaVariaveis.nextLine();

                                if(opcaoCRUD == 1){
                                    Funcionario.criarFuncionario(nome, cpf,dataContratacao, funcionariosBilioteca);
                                }else{
                                    System.out.print("Digite o novo Nome do Funcionario: ");
                                    String novoNome = entradaVariaveis.nextLine();
                                    Funcionario.atualizarFuncionario(novoNome, cpf, dataContratacao, funcionariosBilioteca);
                                }
                            } else if (opcaoCRUD == 2) {
                                System.out.println("\nListagem de Funcionarios:\n");
                                Funcionario.listarFuncionario(funcionariosBilioteca);
                            } else{
                                System.out.print("Digite o cpf do Funcionario para deletar: ");
                                String cpf = entradaVariaveis.nextLine();
                                Funcionario.deletarFuncionario(cpf, funcionariosBilioteca);
                            }
                        }else {
                            if(opcaoCRUD == 1 || opcaoCRUD == 3){
                                System.out.print("Digite o Titulo do Livro: ");
                                String titulo = entradaVariaveis.nextLine();
                                System.out.print("Digite o Nome do Cliente: ");
                                String nome = entradaVariaveis.nextLine();
                                System.out.print("Digite a Data de Emprestimo do Livro: ");
                                String dataEmprestimo = entradaVariaveis.nextLine();
                                System.out.print("Digite a Data de Devolução do Livro: ");
                                String dataDevolucao = entradaVariaveis.nextLine();

                                if(opcaoCRUD == 1){
                                    Emprestimo.criarEmprestimo(titulo,nome, dataEmprestimo, dataDevolucao, emprestimoBiblioteca);
                                }else{
                                    System.out.print("Digite o novo Titulo do Livro do Emprestimo: ");
                                    String novoTitulo = entradaVariaveis.nextLine();
                                    Emprestimo.atualizarEmprestimo(titulo,novoTitulo,nome ,dataEmprestimo, dataDevolucao,emprestimoBiblioteca);
                                }
                            } else if (opcaoCRUD == 2) {
                                System.out.println("\nListagem de Emprestimos:\n");
                                Emprestimo.listarEmprestimo(emprestimoBiblioteca);
                            } else{
                                System.out.print("Digite o Titulo do Livro para deletar: ");
                                String titulo = entradaVariaveis.nextLine();
                                Emprestimo.deletarEmprestimo(titulo, emprestimoBiblioteca);
                            }
                        }
                    }
                }
            }catch (InputMismatchException e){
                System.out.println("\nAtenção: Opção digitada fora dos padrões, tente novamente!");
                System.out.println("Dica: Utilizar apenas numeros, sem letras, pontos ou simbolos");
                break;
            }
        }


//        Funcionario.criarFuncionario("Caio Victor", "1234567","11/06/1990", funcionariosBilioteca);
//        Funcionario.atualizarFuncionario("Caio do Rolimã", "1234567", "11/06/1991", funcionariosBilioteca);
//        //Funcionario.deletarFuncionario("1234567", funcionariosBilioteca);
//        Funcionario.listarFuncionario(funcionariosBilioteca);
//
//        // criar clientes biblioteca
//        Cliente.criarCliente("João Filho","1456321",18,"Rua dos Alfeneiros","São José da Lagoa Tapada", clientesBilioteca);
//        Cliente.criarCliente("Marcos Paulo","558145",21,"Rua Marcos Valadares","São José do Rio Preto", clientesBilioteca);
//        Cliente.criarCliente("Elias Monkbiel","478963",35,"Rua José de Sa","São Paulo", clientesBilioteca);
//       Cliente.criarCliente("Manoel Gomes","234569",50,"Rua Duda Xerques","Rio de Janeiro", clientesBilioteca);
//        //atualizar cliente
//       //Cliente.atualizarCliente("João Filho","Ze de Nina",20,"Rua Geraldo de Sá","Lagoa Bom Jesus", clientesBilioteca);
//        //deletar cliente
//        Cliente.deletarCliente("Elias Monkbiel", clientesBilioteca);
//        //listar Clientes
//       Cliente.listarClientes(clientesBilioteca);
//
//
//        // criar livro
//        Livro.criarLivro("livro 1", "Douglas Adams", 193, livrosBiblioteca);
//       Livro.criarLivro("livro 2", "Douglas Adams", 193, livrosBiblioteca);
//      Livro.criarLivro("livro 3", "Douglas Adams", 193, livrosBiblioteca);
//        // atualizar livro
//      //  Livro.atualizarLivro("livro 1","O Restaurante no Fim do Universo", "Ygor", 45, livrosBiblioteca);
//        // deletar livro
//      //  Livro.deletarLivro("livro 2", livrosBiblioteca);
//        // listar todos os livros
//       Livro.listarLivros(livrosBiblioteca);
//
//
//        //criar emprestimo
//        Emprestimo.criarEmprestimo("Livro 1","João", "02/03/2023", "03/03/2023", emprestimoBiblioteca);
//        Emprestimo.criarEmprestimo("Livro 2","Ygor", "01/02/2023", "05/02/2023", emprestimoBiblioteca);
//        Emprestimo.criarEmprestimo("Livro 3","Caio", "25/01/2023", "30/01/2023", emprestimoBiblioteca);
//
//        Emprestimo.listarEmprestimo(emprestimoBiblioteca);
//
//        System.out.println("------");
//
//        // atualizar emprestimo
//        Emprestimo.atualizarEmprestimo("Livro 1","livro 0","Pedro" ,"01/04/2023", "05/04/2023",emprestimoBiblioteca);
//        // deletar emprestimo
//        Emprestimo.deletarEmprestimo("Livro 2", emprestimoBiblioteca);
//        // Listar todos os emprestimos
//        Emprestimo.listarEmprestimo(emprestimoBiblioteca);

    }
}
