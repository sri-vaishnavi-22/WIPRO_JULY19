package aug2;

class PrimeSumThread extends Thread {
    int start, end;
    int sum = 0;

    PrimeSumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

public class prog4 {
    public static void main(String[] args) throws InterruptedException {
        PrimeSumThread t1 = new PrimeSumThread(1, 50);
        PrimeSumThread t2 = new PrimeSumThread(51, 100);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        int totalSum = t1.sum + t2.sum;
        System.out.println("Sum of prime numbers: " + totalSum);
    }
}
