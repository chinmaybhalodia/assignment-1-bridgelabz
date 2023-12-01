public class Problem2 {
    public static void main(String[] args) {
        int year;

        // taking input from args[0]
        // cheking if input is of 4 digits
        if (args.length == 0 || Integer.parseInt(args[0]) < 1000 || Integer.parseInt(args[0]) > 9999) {
            System.out.println("Invalid input.");
            return;
        } else {
            year = Integer.parseInt(args[0]);
        }

        // checking for leap year
        if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) {
            System.out.println("Year is leap year.");
        } else {
            System.out.println("Year is not leap year.");
        }
    }
}
