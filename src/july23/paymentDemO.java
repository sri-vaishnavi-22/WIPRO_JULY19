package july23;
import java.util.Scanner;

class Payment {
    void pay() {
        System.out.println("Processing payment...");
    }
}

class CreditCard extends Payment {
    @Override
    void pay() {
        System.out.println("Payment done through Credit Card");
    }
}

class UPI extends Payment {
    @Override
    void pay() {
        System.out.println("Payment done through UPI");
    }
}

class NetBanking extends Payment {
    @Override
    void pay() {
        System.out.println("Payment done through Net Banking");
    }
}

class paymentDemo {  // removed 'public' so filename doesn't need to match
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Net Banking");
        int choice = sc.nextInt();

        Payment payment;
        switch (choice) {
            case 1:
                payment = new CreditCard();
                break;
            case 2:
                payment = new UPI();
                break;
            case 3:
                payment = new NetBanking();
                break;
            default:
                System.out.println("Invalid choice! Using default payment.");
                payment = new Payment();
        }

        payment.pay();
        sc.close();
    }
}
