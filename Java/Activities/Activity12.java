package day4;

public class Activity12 {
	
	interface Addable {
		int add(int num1, int num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addable ad1 = (num1, num2) -> num1 + num2;
		System.out.println(ad1.add(1, 2));
		
		
		Addable ad2 = ((num1, num2) -> {
			int result = num1+num2;
			return result;
		});
		System.out.println(ad2.add(2, 3));

	}
}
