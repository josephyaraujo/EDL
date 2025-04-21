package POO_em_Java;

public class Caneta {
    String cor;
    float ponta;
    boolean tampada;
    void status(){
        System.out.println ("Uma caneta "+ this.cor); //quando eu uso o this eu faço autoreferência, ou seja, quem chamou o método status (o objeto que chamou) será substituído por this
        System.out.println ("Ponta: " + this.ponta);
        System.out.println ("Está tampada? " + this.tampada);    
    }
    
    void rabiscar(){
        if (this.tampada == true){
            System.out.println ("Erro! Não posso rabiscar.");
        }
        else{
            System.out.println ("Estou rabiscando");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }

}
