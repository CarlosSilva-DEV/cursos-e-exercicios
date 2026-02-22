package aula12.Repteis;
public class Tartaruga extends Reptil {
    // Construtor
    public Tartaruga(String corEscama, float peso, int idade, int membros) {
        super(corEscama, peso, idade, membros);
    }
    
    // sobrescrição do método da classe reptil
    @Override
    public void locomover() {
        System.out.println("Andando beeeeeem lentamente...");
    }
}
