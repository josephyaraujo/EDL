package Pilha.Pilha_Rubro_Negra;
public class TestePilhaQ5 {
    public static void main(String[] args) {
        DuasPilhas pilhaVP = new DuasPilhas(3, 4);
        System.out.println("Pilha vermelha está vazia: " + pilhaVP.isEmptyRed());
        System.out.println("Pilha preta está vazia: " + pilhaVP.isEmptyBlack());
        
        pilhaVP.pushRed(8);
        pilhaVP.pushBlack(3);
        pilhaVP.pushBlack(4);

        System.out.println("Tamanho da pilha vermelha: " + pilhaVP.sizeRed());
        System.out.println("Tamanho da pilha preta: " + pilhaVP.sizeBlack());

        pilhaVP.pushRed(2);

        System.out.println("Topo da pilha vermelha: " + pilhaVP.topRed());
        System.out.println("Topo da pilha preta: " + pilhaVP.topBlack());

        pilhaVP.pushRed(7);
        System.out.println("Topo da pilha vermelha: " + pilhaVP.topRed());

        pilhaVP.pushRed(1);
        System.out.println("Tamanho da pilha vermelha: " + pilhaVP.sizeRed());
        System.out.println("Tamanho da pilha preta: " + pilhaVP.sizeBlack());

        System.out.println("Topo da pilha vermelha: " + pilhaVP.topRed());
        System.out.println("Topo da pilha preta: " + pilhaVP.topBlack());

        System.out.println("Removido da pilha vermelha: " + pilhaVP.popRed());
        System.out.println("Removido da pilha vermelha: " + pilhaVP.popRed());
        System.out.println("Removido da pilha preta: " + pilhaVP.popBlack());

        System.out.println("Tamanho da pilha vermelha: " + pilhaVP.sizeRed());
        System.out.println("Tamanho da pilha preta: " + pilhaVP.sizeBlack());

        System.out.println("Topo da pilha vermelha: " + pilhaVP.topRed());
        System.out.println("Topo da pilha preta: " + pilhaVP.topBlack());
    }   
}
