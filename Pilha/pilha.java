public interface pilha {    
    public int size();    
    public boolean isEmpty();
    public Object top() throws pilhaVaziaExcecao;
    public void push(Object o);
    public Object pop() throws pilhaVaziaExcecao;
}