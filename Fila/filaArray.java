// A fila é uma estrutura de dados do tipo FIFO (first in, first out)

public class filaArray implements fila {
    private int capadicade;
    private Object[] array;
    private int i; //início
    private int f; //fim
    private int tamanho;

    public filaArray (int cap){
        this.capacidade = cap;
        i = 0;
        f = -1;
        tamanho = 0; 
        array = new Object[capacidade];
    }
    //enqueue: adiciona um elemento no final da fila
    public void enqueue (Object elemento){
        if (size() == tamanho - 1){
            throw new filaExcecao ("A fila está cheia");
        } else {
        f = (f + 1) % capacidade;
        array [f] = elemento; 
        tamanho++;
        }
    }
    //dequeue: remove e retorna o elemento do início da fila
    public Object dequeue() throws filaVaziaExcecao {
        if (isEmpty()){
            throw new filaExcecao ("A fila está vazia");
        }
        Object removido = array [i];
        array [i] = null;
        i = (i + 1) % capacidade;
        tamanho--;
        return removido;
    }
    // first: retorna (mas não remove) o elemento no início da fila
    public Object first() throws filaVaziaExcecao {
        if (isEmpty()){
            throw new filaExcecao ("A fila está vazia");
        }
        return array [i];
    }
    //isEmpty: verifica se a fila está vazia
    public boolean isEmpty(){
        return (i = f);
    }
    //size: retorna o número de elementos na fila
    public int size(){
        return (tamanho - i + f) % tamanho;
    } 
}