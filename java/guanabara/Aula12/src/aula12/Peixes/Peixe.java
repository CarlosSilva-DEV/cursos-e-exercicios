package aula12.Peixes;
import aula12.Animal;
public class Peixe extends Animal { // herança da classe generalizada
    private String corEscama;
    
    // Construtor
    public Peixe(String corEscama, float peso, int idade, int membros) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    public void soltarBolhas() {
        // método especial
        System.out.println("Soltou uma bolha");
    }
    
    @Override // sobrescrição de métodos abstratos da classe mãe
    public void locomover() {
        System.out.println("Nadando...");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Comendo substancias...");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som :/");
    }
}
