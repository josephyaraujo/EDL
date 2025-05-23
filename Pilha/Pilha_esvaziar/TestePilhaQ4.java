package Pilha.Pilha_esvaziar;

public class TestePilhaQ4{
	public static void main(String[] args) {			
		PilhaArrayEmpty pp = new PilhaArrayEmpty(1,0);
		System.out.println("inserindo");
		for(int f=0;f<10;f++){
			System.out.println(f);
			pp.push(f);
		}
		System.out.println("tamanho inicial: "+ pp.size());
		pp.empty();
		System.out.println("esvaziando");
		System.out.println("tamanho atual: "+ pp.size());
		
	}
}
