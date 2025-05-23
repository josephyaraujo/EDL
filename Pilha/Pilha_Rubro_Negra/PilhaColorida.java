package Pilha.Pilha_Rubro_Negra;

public interface PilhaColorida {
    public int sizeRed();
    public boolean isEmptyRed(); 
    public Object topRed() throws PilhaVaziaExcpt; 
    public void pushRed(Object elemento); 
    public Object popRed() throws PilhaVaziaExcpt; 
     public int sizeBlack(); 
    public boolean isEmptyBlack(); 
    public Object topBlack() throws PilhaVaziaExcpt; 
    public void pushBlack(Object elemento); 
    public Object popBlack() throws PilhaVaziaExcpt; 
}
