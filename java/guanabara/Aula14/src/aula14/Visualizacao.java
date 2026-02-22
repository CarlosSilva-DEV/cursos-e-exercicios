package aula14;
public class Visualizacao {
    private Usuario espectador; // relacionamento de agregação
    private Video filme;
    
    // Construtor
    public Visualizacao(Usuario espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.filme.setReproduzindo(true); // reproduzindo = true,sempre que criar uma nova visualização
        this.espectador.setTotalAssistidos(this.espectador.getTotalAssistidos() + 1); // adiciona 1 video assistido ao perfil do usuario
        this.filme.setViews(this.filme.getViews() + 1); // adiciona 1 view ao video assistido
    }
    
    // getters e setters
    public Usuario getEspectador() {
        return espectador;
    }
    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + 
                ", filme=" + filme + "}\n";
    }
    
    // métodos sobrecarregados
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porcentagem) {
        int total = 0;
        if (porcentagem <= 20) {
            total = 3;
        } else if (porcentagem <= 50) {
            total = 5;
        } else if (porcentagem <= 90) {
            total = 8;
        } else {
            total = 10;
        }
        
        this.filme.setAvaliacao(total);
    }
}
