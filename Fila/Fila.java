public interface Fila {
    public int size();
    public boolean isEmpty();
    public Object first() throws FilaExcecao;
    public void enqueue (Object elemento);
    public Object dequeue() throws FilaExcecao;    
}