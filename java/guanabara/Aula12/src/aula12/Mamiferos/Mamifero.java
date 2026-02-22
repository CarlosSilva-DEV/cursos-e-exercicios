package aula12.Mamiferos;
import aula12.Animal;
public class Mamifero extends Animal { // herança da classe generalizada
    private String corPelo;
    
    // Construtor
    public Mamifero(String corPelo, float peso, int idade, int membros) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }
    
    // sobrescrição dos métodos da classe mãe
    @Override
    public void locomover() {
        System.out.println("Correndo...");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Mamando...");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero...");
    }
}
