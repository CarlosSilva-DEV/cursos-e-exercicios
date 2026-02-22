package aula10;
public class Bolsista extends Aluno {
    private boolean bolsa;
    
    public boolean getBolsa() {
        return this.bolsa;
    }
    public void setBolsa(boolean bolsa) {
        this.bolsa = bolsa;
    }
    
    
    public void renovarBolsa() {
        this.setBolsa(true);
        System.out.println("Bolsa renovada com sucesso!");
    }
}
