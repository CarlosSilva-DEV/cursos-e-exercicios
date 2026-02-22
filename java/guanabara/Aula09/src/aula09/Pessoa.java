package aula09;
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    // Construtor
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    // métodos
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getSexo() {
        return this.sexo;
    }
    public void setSexo(String sexo) {    
        this.sexo = sexo;
    }

    public void fazerAniver() {
        this.setIdade(this.getIdade() + 1);
    }
}
