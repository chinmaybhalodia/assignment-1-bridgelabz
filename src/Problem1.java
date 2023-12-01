public class Problem1 {
	public static void main(String[] args) {
		int heads = 0, tails = 0;
		int count;

		// taking count from args[0]
		// checking if input is valid or else assign 100
		if (args.length == 0 || Integer.parseInt(args[0]) < 0) {
			count = 100;
		} else {
			count = Integer.parseInt(args[0]);
		}

		for (int i = 0; i < count; i++) {
			double val = Math.random();
			if (val > 0.5)
				heads++;
			else
				tails++;
		}

		System.out.println("Percentage of heads: " + (double) (heads * 100 / count) + "%");
		System.out.println("Percentage of tails: " + (double) (tails * 100 / count) + "%");
	}
}
