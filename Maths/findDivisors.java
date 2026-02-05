public class findDivisors {
    public static void main(String[] args) {
        int number = 28; // Example number
        System.out.println("Divisors of " + number + ":");
        findDivisors(number);
    }

    public static void findDivisors(int num) {
        for (int i = 1; i*i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                if (i != num/i) {
                    System.out.print(num/i + " ");
                }
            }
        }
    }
}