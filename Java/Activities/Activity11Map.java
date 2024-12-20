package Day3;

import java.util.HashMap;

public class Activity11Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> colors = new HashMap<Integer, String>();
		colors.put(1, "Black");
		colors.put(2,  "Blue");
		colors.put(3, "Green");
		colors.put(4,  "Yellow");
		colors.put(5, "Red");
		colors.put(6, "Violet");
		
		System.out.println(colors);
		colors.remove(6);
		System.out.println(colors);
		if(colors.containsValue("Green")) {
			System.out.println("Green exists in the list");
		}
		else System.out.println("No Green color exists in the list ");
		if(colors.containsValue("Orange")) {
			System.out.println("Orange exists in the list");
		}
		else System.out.println("No Orange color exists in the list ");
		System.out.println(colors.size());
	}

}
