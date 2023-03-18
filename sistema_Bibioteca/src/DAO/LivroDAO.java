package DAO;

import Model.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class LivroDAO {
    public LivroDAO() {

    }

     List<Livro> livros = new ArrayList<>();


    public void criarLivro(Livro livro) {
        livros.add(livro);
    }

    public void atualizarLivro(String isbn ,String novoTitulo, String novoAutor, int novoNum_Paginas) {
        boolean encontrado = false;
        for (Livro livro : livros) {
            if (Objects.equals(livro.getIsbn(), isbn)) {
                livro.setTitulo(novoTitulo);
                livro.setAutor(novoAutor);
                livro.setNumero_pagina(novoNum_Paginas);
                System.out.println("Atualização Concluida!");
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("Atualização NÃO Conlcuida, Livro não existe!!");
        }
    }
    public void deletarLivro(String isbn) {
        for (Livro liv : livros) {
            if (Objects.equals(liv.getIsbn(), isbn)) {
                livros.remove(liv);
                break;
            }
        }
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println("ISBN: " + livro.getIsbn() + ", Título: " + livro.getTitulo() + ", Autor: " +
                    livro.getAutor() + ", Número de Páginas: " + livro.getNumero_pagina());
        }
    }
}
