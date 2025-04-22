package POO_em_Java.aula_04;

public class Caneta2 {
    public String cor;
    private float ponta;
    private boolean tampada; 

    public Caneta2() { //este é o método construtor
        this.tampar();
    }
    public String getCor(){ //como aqui eu vou ter um retorno eu preciso que o que será retornado seja tipado, no caso, string
        return this.cor; 
    }
    public void setCor(String c){ //como aqui não tem retorno, será uma alteração, eu uso void
        cor = c;
    }
    public float getPonta(){
        return this.ponta; 
    }
    public void setPonta(float p){
        ponta = p;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public void status(){
        System.out.println("Sobre a caneta:");
        System.out.println("Cor: "+ this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Tampada: "+ this.tampada);
    } 
}
