package aula03;
public class Aula03 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f;
        c1.carga = 80;
        c1.destampar(); // Método da classe Caneta, permite alterar o valor do atributo (em vez de alterá-lo através da instância)
        
        c1.status();
        c1.rabiscar();
    }
}
