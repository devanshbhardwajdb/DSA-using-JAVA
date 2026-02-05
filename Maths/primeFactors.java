public class primeFactors {
    public static void main(String[] args) {
        int number = 10; // Example number
        System.out.println("Prime factors of " + number + ":");
        findPrimeFactors(number);
    }   
    
    public static void findPrimeFactors(int num) {
        for (int i = 2; i*i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }
        if (num > 1) {
            System.out.print(num);
        }
    }
}