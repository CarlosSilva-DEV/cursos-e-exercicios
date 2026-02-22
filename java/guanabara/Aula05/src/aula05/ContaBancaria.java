package aula05;
public class ContaBancaria {
    public int numConta;
    protected String tipoConta;
    private String titularConta;
    private float saldoConta;
    private boolean statusConta;
    
    
    public void estadoAtual() {
        System.out.println("Numero da Conta: " + this.getNumConta());
        System.out.println("Tipo de Conta: " + this.getTipoConta());
        System.out.println("Titular: " + this.getTitularConta());
        System.out.println("Saldo Atual: " + this.getSaldoConta());
        System.out.println("Conta Bancaria Ativa?: " + this.getStatusConta());
        System.out.println("======================================");
    }
    
    public ContaBancaria() { // Construtor, define saldo inicial = 0 e status inicial = false;
        this.saldoConta = 0;
        this.statusConta = false;
    }
    
    public int getNumConta() {
        return this.numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    public String getTipoConta() {
        return this.tipoConta;
    }
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    
    public String getTitularConta() {
        return this.titularConta;
    }
    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }
    
    public float getSaldoConta() {
        return this.saldoConta;
    }
    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }
    
    public boolean getStatusConta() {
        return this.statusConta;
    }
    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }
    
    
    public void abrirConta(String tipoConta) {
        this.setTipoConta(tipoConta);
        this.setStatusConta(true);
        
        if (this.getTipoConta().equals("CC")) {
            this.setSaldoConta(50.0f);
        } else if (this.getTipoConta().equals("CP")) {
            this.setSaldoConta(150.0f);
        }
        
        System.out.println("Conta aberta com sucesso!");
        System.out.println("-------------------------");
    }
    
    public void fecharConta() { // inserir condicional: não pode fechar caso haja saldo ou débito
        if (this.getSaldoConta() > 0) {
            System.out.println("ERRO! Saque o saldo disponivel na conta para poder fecha-la");
        } else if (this.getSaldoConta() < 0) {
            System.out.println("ERRO! Debito em aberto na conta, solucione para poder fechar a conta");
        } else {
           this.setStatusConta(false);
            System.out.println("Conta encerrada com sucesso!");
            System.out.println("----------------------------");
        }
    }
    
    public void depositarSaldo(float valorDeposito) { // inserir condicional: não pode depositar em conta fechada
        if (this.getStatusConta() == true) {
            this.setSaldoConta(this.getSaldoConta() + valorDeposito);
            System.out.println("Deposito realizado na conta de " + this.getTitularConta());
            System.out.println("---------------------------------------");
        } else {
            System.out.println("ERRO! Conta fechada, nao foi possivel realizar o deposito");
        }
    }
    
    public void sacarSaldo(float valorSaque) { // inserir condicional: não pode sacar conta fechada ou sem saldo suficiente
        if (this.getStatusConta() == true && this.getSaldoConta() >= valorSaque) {
            this.setSaldoConta(this.getSaldoConta() - valorSaque);
            System.out.println("Saque realizado na conta de " + this.getTitularConta());
            System.out.println("----------------------------------------");
        } else {
            System.out.println("ERRO! Saldo insuficiente ou conta não aberta, nao foi possivel realizar o saque");
        }
    }
    
    public void pagarMensal() { // CC = -12; CP = -20
        float valorMensal = 0;
        
        if (this.getTipoConta().equals("CC")) {
            valorMensal = 12.0f;
        } else if (this.getTipoConta().equals("CP")) {
            valorMensal = 20.0f;
        }
        
        if (this.getStatusConta() == true && this.getSaldoConta() > valorMensal) {
            this.setSaldoConta(this.getSaldoConta() - valorMensal);
            System.out.println("Pagamento da mensalidade realizado por " + this.getTitularConta());
        } else {
            System.out.println("ERRO! Saldo insuficiente ou conta não aberta, nao foi possivel pagar a mensalidade");
        }
    }
}