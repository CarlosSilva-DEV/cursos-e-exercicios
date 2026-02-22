package aula12.Repteis;
import aula12.Animal;
public class Reptil extends Animal {
    private String corEscama;
    
    // Construtor
    public Reptil(String corEscama, float peso, int idade, int membros) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }
    
    // sobrescrição
    @Override
    public void locomover() {
        System.out.println("Rastejando...");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais...");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Som de reptil...");
    }
}
