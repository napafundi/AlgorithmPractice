public class ExclamationMarksBalance {
	private String left;
    private String right;

    public ExclamationMarksBalance(String left, String right) {
        this.left = left;
        this.right = right;
    }

    public String balanceFinder() {
        int leftSum = weightFinder(left);
        int rightSum = weightFinder(right);

        if (leftSum > rightSum) {
            return "Left";
        } else if (leftSum < rightSum) {
            return "Right";
        } else {
            return "Balance";
        }
    }

    private int weightFinder(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '!') {
                sum += 2;
            } else {
                sum += 3;
            }
        }
        return sum;
    }
    
    public void setLeft(String left) {
    	this.left = left;
    }
    
    public void setRight(String right) {
    	this.right = right;
    }

}