public class Demo061 {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true; 
    }
    public static void printFirst10Primes() {
        int count = 0;
        int num = 2;
        while (count < 10) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
        public static void main(String[] args) {
        System.out.println("The first 10 prime numbers are:");
        printFirst10Primes();
    }
}
