package Day3;

public class CustomException extends Exception{
	
	private String message;
	
	CustomException(String message){
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}
