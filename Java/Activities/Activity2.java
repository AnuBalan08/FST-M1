
public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 77, 10, 54, -11, 10};
		int searchFor = 10;
		int expectedNum = 30;
		System.out.println(returnBoolean(arr, searchFor, expectedNum));
	}
	
	public static boolean returnBoolean(int[] arr1, int searchNum, int expectedNumber) {
		
		int sum = 0;
		for(int i = 0; i<arr1.length;i++) {
			if(arr1[i] == searchNum) {
				sum = sum + arr1[i];
			}
			
			if(sum > expectedNumber ) {
				break;
			}
		}
		return sum == expectedNumber;
	}

}
