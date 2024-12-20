package Day3;

import java.util.ArrayList;

public class Activity9ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Anu");
		arr.add("Balan");
		arr.add("Malar");
		arr.add("Anitha");
		arr.add("Guru");
		arr.add("Diya");
		for(String i : arr) {
			System.out.println(i);
		}
		System.out.println(arr.get(3));
		System.out.println(arr.contains("Malar"));
		System.out.println(arr.contains("Mona"));
		arr.add("Kani");
		System.out.println(arr.size());
		System.out.println(arr);
		System.out.println(arr.remove("Kani"));
		System.out.println(arr);

	}

}
