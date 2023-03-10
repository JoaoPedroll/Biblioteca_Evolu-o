import java.util.ArrayList;

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

    public static void criarEmprestimo(String nome_cliente, int data_emprestimo, int data_devolucao, ArrayList<Emprestimo> emprestimos){
        Emprestimo emprestimo = new Emprestimo(nome_cliente, data_emprestimo, data_devolucao);
        emprestimos.add(novoEmprestimo);
    }
    public static void atualizarEmprestimo(String nome_cliente, int data_emprestimo, int data_devolucao, ArrayList<Emprestimo> emprestimos){
        for (Emprestimo emprestimo : emprestimos){
            if(emprestimo.getLivro() == livro){
                emprestimo.setLivro(novoLivro);
                emprestimo.setData_emprestimo(novoEmprestimo);
                emprestimo.setData_devolucao(novoDevolucao);
                break;
            }
        }
    }
    public static void deletarEmprestimo(String nome_cliente, int data_emprestimo, int data_devolucao, ArrayList<Emprestimo> emprestimos){
        for (Emprestimo emprestimo : emprestimos){
            if(emprestimo.getData_emprestimo() == Emprestimo){
                emprestimo.remove(emprestimo);
                break;
            }
        }
    }

    public static void listarEmprestimo(ArrayList<Emprestimo> emprestimos){
        for (Emprestimo emprestimo : emprestimos){
            System.out.println("Emprestimo: " + emprestimo.getLivro() + ", Data de Emprestimo: " + emprestimo.getData_emprestimo() + ", Data de Devolução: " + emprestimo.getData_devolucao());
        }
    }
}
