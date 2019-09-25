import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class Tests {
	ArrayDeepCount tester = new ArrayDeepCount();
	static ArrayList<Object> arr;
	
	@BeforeEach
	public void setUp() {
		arr = new ArrayList<Object>();
	}
	
	@Test
	void TestEmptyArrayReturnsZero() {
		assertEquals(0, tester.deepCount(arr));
	}
	
	@Test
	void TestArrayReturnsThree() {
		arr.add(1);
		arr.add(2);
		arr.add(3);
		
		assertEquals(3, tester.deepCount(arr));
	}
	
	@Test
	void TestArrayReturnsFour() {
		arr.add('x');
		arr.add('y');
		
		ArrayList<Object> arr2 = new ArrayList<Object>();
		arr2.add('z');
		
		arr.add(arr2);
		
		assertEquals(4, tester.deepCount(arr));
	}
	
	@Test
	void TestArrayReturnsSeven() {
		arr.add(1);
		arr.add(2);
		
		ArrayList<Object> arr2 = new ArrayList<Object>();
		arr2.add(3);
		arr2.add(4);
		
		ArrayList<Object> arr3 = new ArrayList<Object>();
		arr3.add(5);
		
		arr2.add(arr3);
		arr.add(arr2);
		
		assertEquals(7, tester.deepCount(arr));
	}
	
	// The test for a a nested array going 8 levels down has been omitted for brevity's sake.

}