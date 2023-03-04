import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Livro> livrosBiblioteca = new ArrayList<>();

        // criar livro
        Livro.criarLivro("livro 1", "Douglas Adams", 193, (ArrayList<Livro>) livrosBiblioteca);
        Livro.criarLivro("livro 2", "Douglas Adams", 193, (ArrayList<Livro>) livrosBiblioteca);
        Livro.criarLivro("livro 3", "Douglas Adams", 193, (ArrayList<Livro>) livrosBiblioteca);

        // atualizar livro
        Livro.atualizarLivro("livro 1","O Restaurante no Fim do Universo", "Ygor", 45, (ArrayList<Livro>) livrosBiblioteca);

        // deletar livro
        Livro.deletarLivro("livro 2", (ArrayList<Livro>) livrosBiblioteca);

        // listar todos os livros
        Livro.listarLivros((ArrayList<Livro>) livrosBiblioteca);


    }
}
