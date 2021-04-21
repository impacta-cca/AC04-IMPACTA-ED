package lista_Prioridade.exception;

@SuppressWarnings("serial")
public class InvalidKeyException extends RuntimeException {
	public InvalidKeyException(String err) {
		super(err);
	}
}
