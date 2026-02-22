package aula07;
import java.util.Random;
public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovacao;
    
    // Construtor que obriga a definir os lutadores logo quando instanciar a luta no main
    public Luta(Lutador l1, Lutador l2) {
        this.marcarLuta(l1, l2);
    }
    // getters e setters
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovacao() {
        return aprovacao;
    }
    public void setAprovacao(boolean aprovacao) {
        this.aprovacao = aprovacao;
    }
    
    // métodos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) { // categorias iguais e lutadores diferentes
            this.aprovacao = true;
            this.setDesafiante(l1);
            this.setDesafiado(l2);
        } else {
            this.aprovacao = false;
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
    }
    
    public void lutar() {
        if (this.aprovacao) {
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentarLutador();
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentarLutador();
            System.out.println("");
            
            // variavel aleatoria, 0 = empate, 1 = vitoria desafiante, 2 = vitoria desafiado
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // utiliza 0, 1 e 2
            
            switch(vencedor) {
                case 0:
                    System.out.println("===========================");
                    System.out.println("RESULTADO DA LUTA: Empate!");
                    System.out.println("");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.println("===========================");
                    System.out.println("RESULTADO DA LUTA: Vitoria de " + this.desafiante.getNome());
                    System.out.println("");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2:
                    System.out.println("===========================");
                    System.out.println("RESULTADO DA LUTA: Vitoria de " + this.desafiado.getNome());
                    System.out.println("");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
            }
            
        } else {
            System.out.println("ERRO: Luta não pode acontecer");
        }
    }
}
