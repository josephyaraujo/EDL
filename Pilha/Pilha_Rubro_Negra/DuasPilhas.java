package Pilha.Pilha_Rubro_Negra; 

public class DuasPilhas implements PilhaColorida {
    private int capacidade; //tamanho máximo do array
    private Object[] pilhaRB; //armazena os elementos da pilha num array de objetos   
    private int topoRed; //índice do topo da pilha vermelha
    private int topoBlack; //índice do topo da pilha preta

    //Método construtor
    public DuasPilhas (int capacidadeRed, int capacidadeBlack){
        capacidade = capacidadeRed+capacidadeBlack+1; 
        topoRed = -1; //começa da esquerda para direita
        topoBlack = capacidade - 1; //começa da direita para esquerda
        pilhaRB = new Object[capacidade]; //cria um array com a capacidade inicial
    }
    //Métodos especiais
    @Override
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public void pushRed(Object elemento) { //inseri um novo elemento no topo da pilha vermelha
        if (topoRed+topoBlack >= capacidade/3){ //verifica se o array está com 1/3 da sua ocupação sendo utilizada 
            capacidade = capacidade/2; //em caso positivo, reduz o tamanho do array pela metade
            Object[] novoArray = new Object[capacidade]; //cria um novo array com a nova capacidade
            for (int i = 0; i < topoRed; i++){
                novoArray[i] = pilhaRB[i]; //copia todos os elementos do antigo array para o novo
            }
            int novoTopoBlack = capacidade - sizeBlack();//calcula o local do novo topo da pilha preta no array com novo tamanho
            for (int i = topoBlack, j = novoTopoBlack; i < pilhaRB.length; i++, j++){
                novoArray[j] = pilhaRB[i]; //copia todos os elementos do antigo array para o novo
            }
            pilhaRB = novoArray; //array antigo agora recebe o array novo
            topoBlack = novoTopoBlack; //atualiza a referência do novo topo da pilha preta 
        }
        if (topoRed >= topoBlack) {
            capacidade = capacidade * 2;
            Object[] novoArray = new Object[capacidade];
            for (int i = 0; i < topoRed; i++){
                novoArray[i] = pilhaRB[i];
            }
            int novoTopoBlack = capacidade - sizeBlack();
            for (int i = topoBlack, j = novoTopoBlack; topoBlack < pilhaRB.length; i++, j++){
                novoArray[j] = pilhaRB[i];
            }
            pilhaRB = novoArray;
            topoBlack = novoTopoBlack; 
        }
        pilhaRB[++topoRed] = elemento; 
    }
    @Override
    public Object popRed()throws PilhaVaziaExcpt {
        if (isEmptyRed()){ //checa se a pilha está vazia
            throw new PilhaVaziaExcpt("A pilha vermelha está vazia");
        }
        Object removido = pilhaRB[topoRed--]; //remove o último elemento (atribui o valor do array[t] ao objeto a ser removido), depois decrementa o valor de t atualizando o topo.
        return removido;
        //na prática o valor ainda fica fisicamente no array, mas como o índice t foi reduzido, ele não será mais acessado por operações normais da pilha, até ser sobrescrito por um novo push(). 
    }
    @Override
    public Object topRed()throws PilhaVaziaExcpt{
        if (isEmptyRed()){ 
            throw new PilhaVaziaExcpt("A pilha vermelha está vazia");
        }
        return pilhaRB[topoRed]; 
    }
    @Override
    public boolean isEmptyRed(){
        return topoRed == -1; 
    }
    @Override
    public int sizeRed(){
        return topoRed+1; 
    }
    @Override
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public void pushBlack(Object elemento) { //inseri um novo elemento no topo da pilha vermelha
        if (topoRed+topoBlack>=capacidade/3){ //verifica se o array está com 1/3 da sua ocupação sendo utilizada 
            capacidade = capacidade/2; //em caso positivo, reduz o tamanho do array pela metade
            Object[] novoArray = new Object[capacidade]; //cria um novo array com a nova capacidade
            for (int i = 0; i < topoRed; i++){
                novoArray[i] = pilhaRB[i]; //copia todos os elementos do antigo array para o novo
            }
            int novoTopoBlack = capacidade - sizeBlack();//calcula o local do novo topo da pilha preta no array com novo tamanho
            for (int i = topoBlack, j = novoTopoBlack; i < pilhaRB.length; i++, j++){
                novoArray[j] = pilhaRB[i]; //copia todos os elementos do antigo array para o novo
            }
            pilhaRB = novoArray; //array antigo agora recebe o array novo
            topoBlack = novoTopoBlack; //atualiza a referência do novo topo da pilha preta 
        }
        if (topoRed >= topoBlack) {
            capacidade = capacidade * 2;
            Object[] novoArray = new Object[capacidade];
            for (int i = 0; i < topoRed; i++){
                novoArray[i] = pilhaRB[i];
            }
            int novoTopoBlack = capacidade - sizeBlack();
            for (int i = topoBlack, j = novoTopoBlack; topoBlack < pilhaRB.length; i++, j++){
                novoArray[j] = pilhaRB[i];
            }
            pilhaRB = novoArray;
            topoBlack = novoTopoBlack; 
        }
        pilhaRB[--topoBlack] = elemento; 
    }
    @Override
    public Object popBlack()throws PilhaVaziaExcpt {
        if (isEmptyBlack()){ //checa se a pilha está vazia
            throw new PilhaVaziaExcpt("A pilha vermelha está vazia");
        }
        Object removido = pilhaRB[topoBlack++]; //remove o último elemento (atribui o valor do array[t] ao objeto a ser removido), depois incrementa o valor de t atualizando o topo.
        return removido;
        //na prática o valor ainda fica fisicamente no array, mas como o índice t foi incrementado, ele não será mais acessado por operações normais da pilha, até ser sobrescrito por um novo push(). 
    }
    @Override
    public Object topBlack()throws PilhaVaziaExcpt{
        if (isEmptyBlack()){ 
            throw new PilhaVaziaExcpt("A pilha preta está vazia");
        }
        return pilhaRB[topoBlack]; 
    }
     @Override
    public boolean isEmptyBlack(){
        return topoBlack == capacidade-1;
    }
    @Override
    public int sizeBlack(){
        return capacidade-topoBlack-1; 
    }
}
