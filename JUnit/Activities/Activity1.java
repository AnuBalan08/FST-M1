import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {
	
	static ArrayList<String> list;
	
	@BeforeEach
	public void setup() throws Exception {
		list = new ArrayList<String>();
		list.add("Anu");
		list.add("Anitha");
		list.add("Guru");
		list.add("Malar");
	}
	
	@Test
	public void insertTest() {
		assertEquals(4, list.size(),"Wrong Size");
		list.add("Mithran");
		assertEquals(5, list.size(),"Wrong Size");
		assertEquals("Anu", list.get(0), "Wrong Element");
		assertEquals("Anitha", list.get(1), "Wrong Element");
		assertEquals("Guru", list.get(2), "Wrong Element");
		assertEquals("Malar", list.get(3), "Wrong Element");
		assertEquals("Mithran", list.get(4), "Wrong Element");
	}
	
	
	public void replaceTest() {
		assertEquals(5, list.size(),"Wrong Size");
		list.set(1, "Vela");
		assertEquals("Vela", list.get(0), "Wrong Element");
		assertEquals("Anitha", list.get(1), "Wrong Element");
		assertEquals("Guru", list.get(2), "Wrong Element");
		assertEquals("Malar", list.get(3), "Wrong Element");
	}

}
