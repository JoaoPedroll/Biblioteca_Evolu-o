package Model;

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

}






