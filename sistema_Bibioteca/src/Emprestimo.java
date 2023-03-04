public class Emprestimo {
    private String livro;
    private String data_emprestimo;
    private String data_devolucao;

    public Emprestimo(String livro, String data_emprestimo, String data_devolucao) {
        this.livro = livro;
        this.data_emprestimo = data_emprestimo;
        this.data_devolucao = data_devolucao;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(String data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public String getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "livro='" + livro + '\'' +
                ", data_emprestimo='" + data_emprestimo + '\'' +
                ", data_devolucao='" + data_devolucao + '\'' +
                '}';
    }
}
