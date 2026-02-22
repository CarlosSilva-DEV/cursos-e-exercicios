package aula11;
public class Bolsista extends Aluno {
    private float bolsa;

    public Bolsista(String nome, int idade, String sexo, int matricula, String curso, float bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }
    
    public float getBolsa() {
        return bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
    public void renovarBolsa() {
        System.out.println("Bolsa do aluno " + this.getNome() + " renovada com sucesso!");
    }
    
    @Override // sobreposição do metodo de pagamento de mensalidade, já que existe o desconto de bolsa
    public void pagarMensalidade() {
        System.out.println("Mensalidade do bolsista " + this.getNome() + " paga com sucesso!");
    }
}
