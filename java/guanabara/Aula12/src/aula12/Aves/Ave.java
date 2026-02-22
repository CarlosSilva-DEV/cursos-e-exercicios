package aula12.Aves;
import aula12.Animal;
public class Ave extends Animal {
    private String corPena;
    
    // Construtor
    public Ave(String corPena, float peso, int idade, int membros) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }
    
    public void fazerNinho() {
        System.out.println("Construindo ninho...");
    }
    
    // sobrescrição de métodos
    @Override
    public void locomover() {
        System.out.println("Voando...");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Comendo frutas...");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Som de ave...");
    }
}
