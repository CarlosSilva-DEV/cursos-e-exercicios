package aula09;
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    // Construtor
    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {    
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    //getters e setters
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

    public int getTotalPaginas() {
        return totalPaginas;
    }
    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    // métodos
    public String detalhes() {
        System.out.println("\n----------------------------");
        return "Livro{" + "titulo: " + titulo + ", "
                + "\nauto: " + autor + ", "
                + "\ntotalPaginas: " + totalPaginas + ", "
                + "\npagAtual: " + pagAtual + ", "
                + "\naberto: " + aberto + ", "
                + "\nleitor: " + leitor.getNome() + ", "
                + "\nidade: " + leitor.getIdade() + ", "
                + "\nsexo: " + leitor.getSexo() + '}';
    }
    
    @Override
    public void abrir() {
        this.setAberto(true);
    }
    
    @Override
    public void fechar() {
        this.setAberto(false);
    }
    
    @Override
    public void folhear(int p) {
        if (p > this.getTotalPaginas()) { // previne que o leitor tente folhear para uma página maior do que a quantidade de páginas do livro
            System.out.println("===============================================");
            System.out.println("ERRO: Impossível folhear até a página indicada.");
            System.out.println("===============================================\n");
        } else {
            this.setPagAtual(p);
        }
    }
    
    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }
    
    @Override
    public void voltarPag(){
        this.setPagAtual(this.getPagAtual() - 1);
    }
}
