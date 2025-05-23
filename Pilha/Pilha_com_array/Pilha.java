//TAD (Tipo abstrato de dados) é uma abstração de uma estrutura de dados, definindo seu comportamento, mas não sua execução. 
//Um TAD especifica dados armazenados, operações válidas sobre esses dados, condições de erros associados às operações. Ou seja, define "o que" pode ser feito, sem se preocupar com o "como" é feito.
//O objetivo de um TAD é separar a interface da implementação.   
//Um exemplo de um TAD é a Pilha, onde as inserções e remoções de elementos seguem o esquema LIFO (last in, first out). A pilha tem como suas principais operações: 
public interface Pilha {    
    public int size(); //tamanho da pilha     
    public boolean isEmpty(); //se a pilha está vazia
    public Object top() throws PilhaVaziaExcecao; //retorna o último elemento inserido sem remover ele da pilha  
    public void push(Object elemento); //insere um novo elemento na pilha
    public Object pop() throws PilhaVaziaExcecao; //remove e retorna o último elemento inserido na pilha
}