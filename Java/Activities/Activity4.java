
public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,3,4,6,10,56,7};
		System.out.println("Before ascending order: ");
		for(int num: arr) {
			System.out.println(num);
		}
		for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
		System.out.println("Sorted order: ");
		for(int num: arr) {
			System.out.println(num);
		}
		
	}

}