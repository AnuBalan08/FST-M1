package Day3;

import java.util.HashSet;
import java.util.Set;

public class Activity10HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> s = new HashSet<String>();
		s.add("Anu");
		s.add("Balan");
		s.add("Guru");
		s.add("Malar");
		s.add("Anitha");
		s.add("Mani");
		s.add("Diya");
		
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.remove("Mani"));
		System.out.println(s.size());
		System.out.println(s.contains("Diya"));
		
		System.out.println(s);

	}

}
