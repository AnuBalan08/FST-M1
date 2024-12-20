package Day3;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Activity8.exceptionTest("Will print to console");
			Activity8.exceptionTest(null);	
		}catch(CustomException e){
			System.out.println("Printing from catch block: " + e.getMessage());
			
		}
	}
	public static void exceptionTest(String message) throws CustomException {
		if(message == null) {
			throw new CustomException("The String Value cannot be null");
		}else {
			System.out.println("The message is " +message);
		}
	}

}
