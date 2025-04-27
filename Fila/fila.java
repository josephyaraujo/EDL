public interface fila {
    public int size();
    public boolean isEmpty();
    public Object first() throws filaVaziaExcecao;
    public void enqueue (Object o);
    public Object dequeue() throws filaVaziaExcecao;    
}