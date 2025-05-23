package Pilha.Pilha_Esvaziar;

public interface PilhaEmpty {
    public int size(); //tamanho da pilha (nº de elementos armazenados)     
    public boolean isEmpty(); //se a pilha está vazia
    public Object top() throws PilhaVaziaExc; //retorna o último elemento inserido sem remover ele da pilha  
    public void push(Object elemento); //insere um novo elemento na pilha
    public Object pop() throws PilhaVaziaExc; //remove e retorna o último elemento inserido na pilha
    public void empty(); //retorna a pilha vazia
}