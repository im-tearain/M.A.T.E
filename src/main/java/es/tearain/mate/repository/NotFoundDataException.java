package es.tearain.mate.repository;

public class NotFoundDataException extends RuntimeException {

	/**
	 * Data not found
	 */
	private static final long serialVersionUID = 4442975568158221185L;

	public NotFoundDataException(String message) {
		super(message);
	}
	
}
