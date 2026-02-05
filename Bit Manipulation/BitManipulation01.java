    public class BitManipulation01 {
        public static void main(String[] args) {
            int a = 5; // 0101
            int b = 3; // 0011

            System.out.println("Before swapping: a = " + a + ", b = " + b);
             a = a ^ b;
            b = a ^ b;
            a = a ^ b;
            System.out.println("After swapping: a = " + a + ", b = " + b);

            int n = 5; // 0101
            int i = 2;  
            boolean isSet = checkIthBit(n, i);
            System.out.println("Is the " + i + "th bit of " + n + " set? " + isSet);

            n = setIthBit(n, i);
            System.out.println("Number after setting the " + i + "th bit: " + n);

            n = clearIthBit(n, i);
            System.out.println("Number after clearing the " + i + "th bit: " +  n);

            n = toggleIthBit(n, i);
            System.out.println("Number after toggling the " + i + "th bit: " + n);

            n = removeLastSetBit(n);
            System.out.println("Number after removing the last set bit: " + n);

            int count = countSetBits(n);
            System.out.println("Number of set bits in " + n + ": " + count);

            int powerOfTwo = 16; // 10000
            boolean isPower = isPowerOfTwo(powerOfTwo);
            System.out.println("Is " + powerOfTwo + " a power of two? " + isPower);

            int evenNumber = 4; // 0100
            int oddNumber = 5;  // 0101         
            System.out.println(evenNumber + " is even? " + checkevenodd(evenNumber));
            System.out.println(oddNumber + " is even? " + checkevenodd(oddNumber));

        }

        public static boolean checkIthBit(int n, int i) {
            int mask = 1 << i;
            return (n & mask) != 0;
        }
        public static int setIthBit(int n, int i) {
            int mask = 1 << i;
            return n | mask;
        }
        public static int clearIthBit(int n, int i) {
            int mask = ~(1 << i);
            return n & mask;
        }
        public static int toggleIthBit(int n, int i) {
            int mask = 1 << i;
            return n ^ mask;
        }
        public static int removeLastSetBit(int n) {
            return n & (n - 1);
        }
        public static int countSetBits(int n) {
            int count = 0;
            while (n > 0) {
                count += n & 1; // Increment count if the last bit is set
                n >>= 1; // Right shift to check the next bit
            }
            return count;
        }   
        public static boolean isPowerOfTwo(int n) {
            return n > 0 && (n & (n - 1)) == 0;
        }

        public static boolean checkevenodd(int n) {
            return (n & 1) == 0; // Returns true if even, false if odd
        }
    }
