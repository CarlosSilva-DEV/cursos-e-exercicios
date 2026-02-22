package aula12.Mamiferos;
public class Cachorro extends Mamifero {
    //Construtor
    public Cachorro(String corPelo, float peso, int idade, int membros) {
        super(corPelo, peso, idade, membros);
    }
    
    public void enterrarOsso() {
        System.out.println("Cachorro enterrando o osso...");
    }
    
    public void abanarRabo() {
        System.out.println("Cachorro abanando o rabo ;)");
    }
    
    // sobrescrição do método da classe Mamifero
    @Override
    public void emitirSom() {
        System.out.println("Cachorro latindo...");
    }
}
