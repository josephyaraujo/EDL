// A fila é uma estrutura de dados do tipo FIFO (first in, first out)

public class FilaArray implements Fila {
    private Object[] array; //array que armazena os elementos da fila
    private int i; //índice do elemento de início
    private int f; //índice do elemento que está no fim
    private int tamanho; //capacidade máxima do array 
    private int estrategiaCrescimento; //estratégia para aumentar a capaciade do array quando cheio

    public FilaArray (int capInic, int cresc){
        this.tamanho = capInic;
        i = 0;
        f = 0;
        estrategiaCrescimento = cresc; //fator de crescimento para definir se erá incremento ou duplicação 
        if (cresc <= 0) {
            estrategiaCrescimento = 0; //se o crescimento for menor ou igual a zero, será optado pela duplicação
        }
        array = new Object[tamanho];
    }
    private void redimensionar(){ 
        int novoTamanho = tamanho; 
        if (estrategiaCrescimento == 0){
            novoTamanho *= 2;
        } else {
            novoTamanho += estrategiaCrescimento;
        }
        Object[] novoArray = new Object[novoTamanho]; // cria um novo array com a nova capacidade
        int ii=i;
        for (int ff = 0; ff < array.length; ff++){ // copia os elementos do array antigo para o novo, mantendo a ordem
            novoArray[ff] = array[ii]; // copia o elemento para o novo array (que será linear)
            ii = (ii+1)%tamanho; 
        }
        //ataualiza as referências
        f = size();
        i = 0;
        tamanho = novoTamanho; 
        array = novoArray; //agora usamos o novo array
    }
    //enqueue: adiciona um elemento no final da fila
    @Override
    public void enqueue (Object elemento){
        if (size() == tamanho - 1){
            redimensionar();
        } else {
            array [f] = elemento; 
            f = (f + 1) % tamanho;
        }
    }
    //dequeue: remove e retorna o elemento do início da fila
    @Override
    public Object dequeue() throws FilaExcecao {
        if (isEmpty()){
            throw new FilaExcecao ("A fila está vazia");
        }
        Object removido = array [i];
        i = (i + 1) % tamanho;
        return removido;
    }
    // first: retorna (mas não remove) o elemento no início da fila
    @Override
    public Object first() throws FilaExcecao {
        if (isEmpty()){
            throw new FilaExcecao ("A fila está vazia");
        }
        return array [i];
    }
    //isEmpty: verifica se a fila está vazia
    @Override
    public boolean isEmpty(){
        return (i == f);
    }
    //size: retorna o número de elementos na fila
    @Override
    public int size(){
        return (tamanho - i + f) % tamanho;
    } 
}
