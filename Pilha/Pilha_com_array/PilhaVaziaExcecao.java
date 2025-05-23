//Exceção: pode ser levantada (throw) quando uma operação não pode ser executada (tipo no caso do top e pop se a pilha estiver vazia)
public class PilhaVaziaExcecao extends RuntimeException {
	public PilhaVaziaExcecao(String err){
		super(err);	//chama o construtor da superclasse (RuntimeException), passando a mensagem de erro.
	}   
}