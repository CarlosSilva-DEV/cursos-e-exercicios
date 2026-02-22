package aula13;
public class Mamifero extends Animal {
    protected String corPelo;
    
    // Sobreposição
    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }
}