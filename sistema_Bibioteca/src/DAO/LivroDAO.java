package DAO;

import Model.Livro;

import java.util.ArrayList;
import java.util.List;


public class LivroDAO {
    public LivroDAO() {

    }

     List<Livro> livros = new ArrayList<>();


    public void criarLivro(Livro livro) {
        livros.add(livro);
    }

    public void atualizarLivro(String titulo ,String novoTitulo, String novoAutor, int novoNum_Paginas) {
        for (Livro livro : livros) {
            if (livro.getTitulo() == titulo) {
                livro.setTitulo(novoTitulo);
                livro.setAutor(novoAutor);
                livro.setNumero_pagina(novoNum_Paginas);
                break;
            }
        }
    }
    public void deletarLivro(String titulo) {
        for (Livro liv : livros) {
            if (liv.getTitulo() == titulo) {
                livros.remove(liv);
                break;
            }
        }
    }

    public List <Livro> listarLivros() {
        for (Livro livro : livros) {
            System.out.println("Título: " + livro.getTitulo() + ", Autor: " +
                    livro.getAutor() + ", Número de Páginas: " + livro.getNumero_pagina());
        }
        return livros;
    }
}
