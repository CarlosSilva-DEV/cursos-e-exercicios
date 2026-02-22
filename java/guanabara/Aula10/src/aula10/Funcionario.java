package aula10;
public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    
    public Funcionario() {
        this.trabalhando = true;
    }
    
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    public void exibir() {
        System.out.println(this.getTrabalhando());
    }
    
    public void mudarTrabalho() {
        this.setTrabalhando(!this.getTrabalhando());
    }
}
