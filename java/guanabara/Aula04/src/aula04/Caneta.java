package aula04;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
    
    // Método Construtor
    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        
        this.tampar();
    }
    
    // Métodos Getter-Setters
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
    
    public void status() {
        System.out.println("--------------------------");
        System.out.println("INFORMAÇÕES SOBRE A CANETA");
        System.out.println("--------------------------");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada?: " + this.tampada);
    }
}
