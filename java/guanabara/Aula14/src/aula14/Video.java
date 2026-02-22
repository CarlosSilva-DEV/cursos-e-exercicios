package aula14;
public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    // Construtor
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    // getters e setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) { // calcula media de avaliação com base nas visualizações do video
        int nova;
        nova = (this.getAvaliacao() + avaliacao) / this.getViews();
                
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    // toString
    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + 
                ", avaliacao=" + avaliacao + 
                ", views=" + views + 
                ", curtidas=" + curtidas + 
                ", reproduzindo=" + reproduzindo + '}';
    }
    
    // sobreposição de métodos da interface
    @Override
    public void play() {
        this.setReproduzindo(true);
    }
    
    @Override
    public void pause() {
        this.setReproduzindo(false);
    }
    
    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }
}
