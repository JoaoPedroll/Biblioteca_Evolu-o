package DAO;

import Models.Livro;

import java.util.ArrayList;
import java.util.List;


public class LivroDAO {
    public LivroDAO() {

    }

    static List<Livro> livros = new ArrayList<>();


    public static void criarLivro(Livro livro) {
        livros.add(livro);
    }

    public static void atualizarLivro(String titulo ,String novoTitulo, String novoAutor, int novoNum_Paginas) {
        for (Livro livro : livros) {
            if (livro.getTitulo() == titulo) {
                livro.setTitulo(novoTitulo);
                livro.setAutor(novoAutor);
                livro.setNumero_pagina(novoNum_Paginas);
                break;
            }
        }
    }
    public static void deletarLivro(String titulo, Livro livro) {
        for (Livro liv : livros) {
            if (livro.getTitulo() == titulo) {
                livros.remove(livro);
                break;
            }
        }
    }

    public static void listarLivros(ArrayList<Livro> livros) {
        for (Livro livro : livros) {
            System.out.println("Título: " + livro.getTitulo() + ", Autor: " +
                    livro.getAutor() + ", Número de Páginas: " + livro.getNumero_pagina());
        }
    }
}
