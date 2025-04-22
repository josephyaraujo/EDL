package POO_em_Java.aula_01;

public class Caneta {
    String cor;
    float ponta;
    boolean tampada;
    public void status(){
        System.out.println ("Uma caneta "+ this.cor); //quando eu uso o this eu faço autoreferência, ou seja, quem chamou o método status (o objeto que chamou) será substituído por this
        System.out.println ("Ponta: " + this.ponta);
        System.out.println ("Está tampada? " + this.tampada);    
    }
    
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println ("Erro! Não posso rabiscar.");
        }
        else{
            System.out.println ("Estou rabiscando");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

}
