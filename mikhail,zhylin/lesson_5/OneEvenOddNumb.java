public class OneEvenOddNumb {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        if (number % 2 == 0) {
            System.out.println(number + " is ....even number");
        } else {
            System.out.println(number + " is odd number");
        }
    }
}
