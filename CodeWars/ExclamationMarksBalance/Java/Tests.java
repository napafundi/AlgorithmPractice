import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class Tests {

	@Test
	void BalanceTests() {
		ExclamationMarksBalance tester = new ExclamationMarksBalance("!!", "??");
		assertEquals("Right", tester.balanceFinder());
		
		tester.setLeft("!??");
		tester.setRight("?!!");
		assertEquals("Left", tester.balanceFinder());
		
		tester.setLeft("!?!!");
		tester.setRight("?!?");
		assertEquals("Left", tester.balanceFinder());
		
		tester.setLeft("!!???!????");
		tester.setRight("??!!?!!!!!!!");
		assertEquals("Balance", tester.balanceFinder());
	}

}