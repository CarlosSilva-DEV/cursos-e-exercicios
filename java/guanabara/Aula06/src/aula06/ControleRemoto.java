package aula06;
public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // Construtor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    // getters e setters
    private int getVolume() {
        return volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    // sobrescrevendo métodos da interface
    @Override // anotação: define que estamos sobrescrevendo o método abstrato da interface e o definindo dentro da classe
    public void ligar(){
        this.setLigado(true);
    }
    
    @Override
    public void desligar() {
        this.setLigado(false);
    }
    
    @Override
    public void abrirMenu() {
        System.out.println("Ligado?: " + this.getLigado());
        System.out.println("Tocando?: " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print(" |");
        }
    }
    
    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu");
    }
    
    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 1);
        }
    }
    
    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 1);
        }
    }
    
    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }
    
    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }
    
    @Override
    public void play() {
        if (this.getLigado() && !this.getTocando()) {
            this.setTocando(true);
        } else {
            System.out.println("INVÁLIDO: Reprodução em andamento");
        }
    }
    
    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("INVÁLIDO: Reprodução já pausada");

        }
    }
}