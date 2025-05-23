package Pilha.Pilha_esvaziar;

public class PilhaVaziaExc extends RuntimeException {
	public PilhaVaziaExc(String err){
		super(err);	//chama o construtor da superclasse (RuntimeException), passando a mensagem de erro.
	}   
}