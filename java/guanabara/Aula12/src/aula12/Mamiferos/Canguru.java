package aula12.Mamiferos; // pasta dentro do projeto
public class Canguru extends Mamifero {
    //Construtor
    public Canguru(String corPelo, float peso, int idade, int membros) {
        super(corPelo, peso, idade, membros);
    }
    
    public void usarBolsa() {
        System.out.println("Canguru usando a bolsa...");
    }
    
    // sobrescrição do método da classe Mamifero
    @Override
    public void locomover() {
        System.out.println("Canguru saltando...");
    }
}
