package es.tearain.mate;

public class DuplicatedDataException extends RuntimeException {

	/**
	 * Attempt to duplicate data
	 */
	private static final long serialVersionUID = 5781524775989304588L;

	public DuplicatedDataException(String message) {
		super(message);
	}
	
}
