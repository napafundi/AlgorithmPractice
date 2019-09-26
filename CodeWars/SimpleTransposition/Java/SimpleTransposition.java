public class SimpleTransposition {
	private char[] row1;
	private char[] row2;
	private String text;
	private int textLength;
	
	public SimpleTransposition(String text) {
		this.text = text;
		this.textLength = text.length();
		if (textLength % 2 != 0) {
			row1 = new char[textLength / 2 + 1];
		} else {
			row1 = new char[textLength / 2];
		}
		row2 = new char[textLength / 2];
	}
	
	public String simpleTransposition() {
		int j = 0;
		int k = 0;
		for (int i = 0; i < textLength; i++) {
			if (i % 2 == 0) {
				row1[j] = text.charAt(i);
				j++;
			} else {
				row2[k] = text.charAt(i);
				k++;
			}
		}
		String row1String = new String(row1);
		String row2String = new String(row2);
		return row1String + row2String;
	}

}