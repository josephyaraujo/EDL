package Pilha.Pilha_esvaziar;

public class PilhaArrayEmpty implements PilhaEmpty{
        private int capacidade; //tamanho máximo do array
    private Object[] array; //armazena os elementos da pilha num array de objetos   
    private int t; //índice do topo da pilha
    private int FC; //fator de crescimento: define se o array será duplicado ou incrementado quando cheio

    //Método construtor
    public PilhaArrayEmpty (int capacidade, int crescimento){
        this.capacidade = capacidade; 
        t = -1; //começa em -1 porque a pilha está vazia
        FC = crescimento;
        if (crescimento <= 0){
            FC = 0;
        }
        array = new Object[capacidade]; //cria um array com a capacidade inicial
    }
    //Métodos especiais
    @Override
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public void push(Object elemento) { //inseri um novo elemento no topo da pilha
        if (t>=capacidade-1){ //verifica se a pilha está cheia
            if (FC == 0){ //verifica se o FC for igual a zero, se sim usa o método de crescimento por duplicação
                capacidade *= 2;
            } else {
                capacidade += FC; //senão, usa o método de incremento
            }
            Object novoArray[] = new Object[capacidade]; //cria um novo array com a capacidade aumentada
            for (int i = 0; i < array.length; i++){
                novoArray[i] = array[i]; //copia todos os elementos do antigo array para o novo
            }
            array = novoArray; //array antigo agora recebe o array novo aumentado    
        }
        array[++t] = elemento; //primeira posição livre agora recebe o novo elemento. o ++ tá vindo na frente, porque primeiro incrementa o t pra depois atribuir o valor        
    }
    @Override
    public Object pop()throws PilhaVaziaExc {
        if (isEmpty()){ //checa se a pilha está vazia
            throw new PilhaVaziaExc("A pilha está vazia");
        }
        Object removido = array[t--]; //remove o último elemento (atribui o valor do array[t] ao objeto a ser removido), depois decrementa o valor de t atualizando o topo.
        return removido;
        //na prática o valor ainda fica fisicamente no array, mas como o índice t foi reduzido, ele não será mais acessado por operações normais da pilha, até ser sobrescrito por um novo push(). 
    }
    @Override
    public Object top()throws PilhaVaziaExc{
        if (isEmpty()){ //checa se a pilha está vazia
            throw new PilhaVaziaExc("A pilha está vazia");
        }
        return array[t]; //retorna o último elemento sem remover
    }
    @Override
    public boolean isEmpty(){
        return t == -1; // retorna se t é igual a -1
    }
    @Override
    public int size(){
        return t+1; //retorna a quantidade de elementos aramzenados no array
    }
    @Override
    public void empty(){
        for (int r = 0; r < capacidade; r++){
            array[r] = null; //esvaziando todas as células para não haver acesso indevido a dados antigos
        }
        t = -1; //retornanfo a referência do índice do topo para pilha vazia
    }
}

