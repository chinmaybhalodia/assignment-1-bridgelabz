public class Problem3 {
    public static void main(String[] args) {
        int exp;

        // taking input from args[0]
        // cheking if exponent is valid and in given range
        if (args.length == 0 || Integer.parseInt(args[0]) < 0 || Integer.parseInt(args[0]) >= 31) {
            System.out.println("Invalid input.");
            return;
        } else {
            exp = Integer.parseInt(args[0]);
        }

        int output = 1;
        for (int i = 0; i <= exp; i++) {
            System.out.println("2^" + i + ": " + output);
            output *= 2;
        }
    }
}
