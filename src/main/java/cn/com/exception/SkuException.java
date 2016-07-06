package cn.com.exception;

public class SkuException extends RuntimeException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4728042189224046571L;
	
	public SkuException(String message) {
		super(message);
	}

	public SkuException(String message, Throwable cause) {
		super(message, cause);
	}

}
