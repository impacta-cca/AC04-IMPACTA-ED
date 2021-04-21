package lista_Prioridade.exception;

@SuppressWarnings("serial")
public class BoundaryViolationException extends RuntimeException {

	public BoundaryViolationException(String err) {
		super(err);
	}
}
