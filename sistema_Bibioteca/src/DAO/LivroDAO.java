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

    public void atualizarLivro(String titulo ,String novoTitulo, String novoAutor, int novoNum_Paginas) {
        boolean encontrado = false;
        for (Livro livro : livros) {
            if (Objects.equals(livro.getTitulo(), titulo)) {
                livro.setTitulo(novoTitulo);
                livro.setAutor(novoAutor);
                livro.setNumero_pagina(novoNum_Paginas);
                System.out.println("Atualização Concluida!");
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("Atualização NÃO Conlcuida!!");
        }
    }
    public void deletarLivro(String titulo) {
        for (Livro liv : livros) {
            if (Objects.equals(liv.getTitulo(), titulo)) {
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
