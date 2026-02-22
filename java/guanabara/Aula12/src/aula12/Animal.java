package aula12;
public abstract class Animal { // classe abstrata, sem instanciamento
    protected float peso;
    protected int idade;
    protected int membros;
    
    // Construtor
    public Animal(float peso, int idade, int membros) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }
    
    // métodos abstratos para implementação e sobrescrição nas classes especificas
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}