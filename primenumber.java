import java.util.Scanner;

class PrimeCompositeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers (enter a non-integer to stop):");

        int primeCount = 0;
        int compositeCount = 0;

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();

            if (isPrime(num)) {
                primeCount++;
            } else {
                compositeCount++;
            }
        }

        System.out.println("Prime number count: " + primeCount);
        System.out.println("Composite number count: " + compositeCount);

        scanner.close();
    }

    private static boolean isPrime(int num) {
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
}
