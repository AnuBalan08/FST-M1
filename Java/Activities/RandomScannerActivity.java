package day4;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomScannerActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random indexGen = new Random();
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
//		System.out.println(a.length);
		for(int i = 0; i<a.length; i++ ) {
			a[i] = sc.nextInt();
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int num : a) {
			list.add(num);
		}
		
		System.out.println(list);
		System.out.println(list.get(indexGen.nextInt(list.size())));
		sc.close();
	}

}
