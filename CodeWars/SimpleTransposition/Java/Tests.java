import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Tests {
	
	@Test
	void testSampleText() {
		SimpleTransposition tester = new SimpleTransposition("Sample text");
		String result = tester.simpleTransposition();
		assertEquals("Sml etapetx", result);
	}
	
	// SimpleTransposition here refers to the input text, "Simple transposition"
	@Test
	void testSimpleTransposition() {
		SimpleTransposition tester = new SimpleTransposition("Simple transposition");
		String result = tester.simpleTransposition();
		assertEquals("Sml rnpstoipetasoiin", result);
	}
	
	@Test
	void testKnowCallPublicNextWouldRightAble() {
		SimpleTransposition tester = new SimpleTransposition("know call public next would right able");
		String result = tester.simpleTransposition();
		assertEquals("ko alpbi etwudrgtalnwcl ulcnx ol ih be", result);
	}
}