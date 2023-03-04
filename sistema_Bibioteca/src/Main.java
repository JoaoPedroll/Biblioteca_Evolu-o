import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> livrosBiblioteca = new ArrayList<>();
        ArrayList<Cliente> clientesBilioteca = new ArrayList<>();

        System.out.println("---------------------------------Sistema de Biblioteca---------------------------------");

        // criar clientes biblioteca
        Cliente.criarCliente("João Filho","1456321",18,"Rua dos Alfeneiros","São José da Lagoa Tapada", clientesBilioteca);
        Cliente.criarCliente("Marcos Paulo","558145",21,"Rua Marcos Valadares","São José do Rio Preto", clientesBilioteca);
        Cliente.criarCliente("Elias Monkbiel","478963",35,"Rua José de Sa","São Paulo", clientesBilioteca);
       Cliente.criarCliente("Manoel Gomes","234569",50,"Rua Duda Xerques","Rio de Janeiro", clientesBilioteca);
        //atualizar cliente
       //Cliente.atualizarCliente("João Filho","Ze de Nina",20,"Rua Geraldo de Sá","Lagoa Bom Jesus", clientesBilioteca);
        //deletar cliente
        Cliente.deletarCliente("Elias Monkbiel", clientesBilioteca);
        //listar Clientes
       Cliente.listarClientes(clientesBilioteca);


        // criar livro
        Livro.criarLivro("livro 1", "Douglas Adams", 193, livrosBiblioteca);
       Livro.criarLivro("livro 2", "Douglas Adams", 193, livrosBiblioteca);
      Livro.criarLivro("livro 3", "Douglas Adams", 193, livrosBiblioteca);
        // atualizar livro
      //  Livro.atualizarLivro("livro 1","O Restaurante no Fim do Universo", "Ygor", 45, livrosBiblioteca);
        // deletar livro
      //  Livro.deletarLivro("livro 2", livrosBiblioteca);
        // listar todos os livros
       Livro.listarLivros(livrosBiblioteca);


    }
}
