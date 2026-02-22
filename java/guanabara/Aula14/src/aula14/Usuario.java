package aula14;
public class Usuario extends Pessoa {
    private String login;
    private int totalAssistidos;
    
    // Construtor
    public Usuario(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistidos = 0;
    }
    
    // getters e setters
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistidos() {
        return totalAssistidos;
    }
    public void setTotalAssistidos(int totalAssistidos) {
        this.totalAssistidos = totalAssistidos;
    }
    
    
    @Override
    public String toString() {
        return "Usuario{" + super.toString() + 
                "\nlogin=" + login + 
                ", totalAssistidos=" + totalAssistidos + "}\n";
    }
    
    public void addVideoAssistido() {
        this.setTotalAssistidos(this.getTotalAssistidos() + 1);
    }
}
