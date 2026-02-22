package aula11;
public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    // Construtor
    public Aluno(String nome, int idade, String sexo, int matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }
    
    // getters e setters
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    public void pagarMensalidade() {
        System.out.println("Mensalidade do aluno " + this.getNome() + " paga com sucesso!");
    }
}
