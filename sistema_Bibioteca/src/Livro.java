import java.util.ArrayList;

public class Livro {
    private String titulo;
    private String autor;
    private int numero_pagina;

    public Livro(String titulo, String autor, int numero_pagina) {
        this.titulo = titulo;
        this.autor = autor;
        this.numero_pagina = numero_pagina;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumero_pagina() {
        return numero_pagina;
    }

    public void setNumero_pagina(int numero_pagina) {
        this.numero_pagina = numero_pagina;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numero_pagina=" + numero_pagina +
                '}';
    }

    public static void criarLivro(String titulo, String autor, int numero_pagina, ArrayList<Livro> livros) {
        Livro novoLivro = new Livro(titulo, autor, numero_pagina);
        livros.add(novoLivro);
    }

    public static void atualizarLivro(String titulo ,String novoTitulo, String novoAutor, int novoNum_Paginas, ArrayList<Livro> livros) {
        for (Livro livro : livros) {
            if (livro.getTitulo() == titulo) {
                livro.setTitulo(novoTitulo);
                livro.setAutor(novoAutor);
                livro.setNumero_pagina(novoNum_Paginas);
                break;
            }
        }
    }
    public static void deletarLivro(String titulo, ArrayList<Livro> livros) {
        for (Livro livro : livros) {
            if (livro.getTitulo() == titulo) {
                livros.remove(livro);
                break;
            }
        }
    }


    public static void listarLivros(ArrayList<Livro> livros) {
        for (Livro livro : livros) {
            System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + ", Número de Páginas: " + livro.getNumero_pagina());
        }
    }
}






