package aula05;
public class Aula05 {
    public static void main(String[] args) {
        ContaBancaria p1 = new ContaBancaria();
        p1.setNumConta(1111);
        p1.setTitularConta("Carlos");
        
        ContaBancaria p2 = new ContaBancaria();
        p2.setNumConta(2222);
        p2.setTitularConta("Thais");
        
        
        p1.abrirConta("CC");
        p2.abrirConta("CP");
        
        p1.depositarSaldo(300);
        p2.depositarSaldo(500);
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
}