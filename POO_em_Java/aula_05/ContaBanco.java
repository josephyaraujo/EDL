package POO_em_Java.aula_05;

public final class ContaBanco {
//Atributos
    public int numConta; 
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
//Métodos personalizados
    public void estadoAtual(){
        System.out.println("---------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada, pois ainda há saldo positivo.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada, pois há debito ativo.");
        } else {
            this.setStatus(false);
            System.out.println("Conta Fechada com sucesso!");
        }

    }
    public void depositar(float v){
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de "+getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada.");
        }
    }
    public void sacar(float v){
        if (this.isStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para o saque desejado.");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;            
        } else if ("CP".equals(this.getTipo())) {
            v = 20;
        }
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() - v); 
            System.out.println("Mensalidade paga por " + this.getDono());
        } else {
            System.out.println("Impossível pagar mensalidade");
        }
    }
//Métodos especiais
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }
    public int getNumConta() {
        return this.numConta;
    }
    public void setNumConta(int n) {
        this.numConta = n;
    }
    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }
    public String getDono() {
        return this.dono;
    }
    public void setDono(String d) {
        this.dono = d;
    }
    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float s) {
        this.saldo = s;
    }
    public boolean isStatus() {
        return this.status;
    }
    public void setStatus(boolean st) {
        this.status = st;
    }
    
}


