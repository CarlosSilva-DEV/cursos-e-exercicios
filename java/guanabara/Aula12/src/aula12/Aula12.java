package aula12;
public class Aula12 { // polimorfismo
    public static void main(String[] args) {
        // Referência: Pacote.Pasta.Classe
        aula12.Mamiferos.Canguru c1 = new aula12.Mamiferos.Canguru("Marrom", 85.3f, 2, 4);
        aula12.Mamiferos.Cachorro c2 = new aula12.Mamiferos.Cachorro("Branco", 2.5f, 10, 4);
        
        
        c1.locomover();
        c1.alimentar();
        c1.emitirSom();
        System.out.println("\n");
        c2.locomover();
        c2.alimentar();
        c2.emitirSom();
    } 
}