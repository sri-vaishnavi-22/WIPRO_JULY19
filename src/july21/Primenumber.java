package july21;

public class Primenumber {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // numbers <= 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // divisible by i, not prime
            }
        }
        return true; // no divisors found, it's prime
    }

    // Method to return the number if prime, else return -1
    public static int getPrimeNumber(int num) {
        if (isPrime(num)) {
            return num; // return the number itself if prime
        } else {
            return -1; // -1 indicates it's not prime
        }
    }

    public static void main(String[] args) {
        int number = 29; // test value
        int result = getPrimeNumber(number);

        if (result != -1) {
            System.out.println(result + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
