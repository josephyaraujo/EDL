public class PilhaArray implements Pilha {
    private int capacidade;
    private Object[] elemento; 
    private int t; //variável do topo
    private int FC; //fator de crescimento

    public PilhaArray (int capacidade, int crescimento){
        this.capacidade = capacidade; 
        t = -1;
        FC = crescimento;
        if (crescimento <= 0){
            FC = 0;
        }
        elemento = new Object[capacidade];
    }

    public void push(Object elemento) {
        if (FC == 0){
            capacidade *= 2;
        } else {
            capacidade += FC;
        } 
    }

}