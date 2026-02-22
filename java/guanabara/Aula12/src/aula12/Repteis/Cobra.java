package aula12.Repteis;
public class Cobra extends Reptil {
    // Construtor
    public Cobra(String corEscama, float peso, int idade, int membros) {
        super(corEscama, peso, idade, membros);
    }
    
    // sobrescrição do método da classe Reptil
    @Override
    public void emitirSom() {
        System.out.println("Sssssssssssss...");
    }
}
