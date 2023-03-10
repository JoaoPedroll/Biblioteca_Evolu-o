import java.util.ArrayList;

public class Emprestimo {
    private String livro;
    private String cliente;
    private String data_emprestimo;
    private String data_devolucao;

    public Emprestimo(String livro,String cliente, String data_emprestimo, String data_devolucao) {
        this.livro = livro;
        this.cliente = cliente;
        this.data_emprestimo = data_emprestimo;
        this.data_devolucao = data_devolucao;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
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
                ", cliente='" + cliente + '\'' +
                ", data_emprestimo='" + data_emprestimo + '\'' +
                ", data_devolucao='" + data_devolucao + '\'' +
                '}';
    }

    public static void criarEmprestimo(String livro, String cliente, String data_emprestimo,
                                       String data_devolucao, ArrayList<Emprestimo> emprestimos){
        Emprestimo emprestimo = new Emprestimo(livro,cliente,data_emprestimo,data_devolucao);
        emprestimos.add(emprestimo);
    }
    public static void atualizarEmprestimo(String livro,String novoLivro,String novoCliente
            , String novaDataEmprestimo, String novaDataDevolucao, ArrayList<Emprestimo> emprestimos){
        for (Emprestimo emprestimo : emprestimos){
            if(emprestimo.getLivro() == livro){
                emprestimo.setLivro(novoLivro);
                emprestimo.setCliente(novoCliente);
                emprestimo.setData_emprestimo(novaDataEmprestimo);
                emprestimo.setData_devolucao(novaDataDevolucao);
                break;
            }
        }
    }
    public static void deletarEmprestimo(String nomeLivro, ArrayList<Emprestimo> emprestimos){
        for (Emprestimo emp : emprestimos){
            if(emp.getLivro() == nomeLivro){
                emprestimos.remove(emp);
                break;
            }
        }
    }

    public static void listarEmprestimo(ArrayList<Emprestimo> emprestimos){
        for (Emprestimo emprestimo : emprestimos){
            System.out.println("Emprestimo{ "+ "Livro: " + emprestimo.getLivro() +"Cliente: "+ emprestimo.getCliente() +", Data de Emprestimo: " + emprestimo.getData_emprestimo() + ", Data de Devolução: " + emprestimo.getData_devolucao());
        }
    }
}
