package aug2;

class HelloThread extends Thread {
    public void run() {
        System.out.println("Hello, World!");
    }
}

public class prog1 {
    public static void main(String[] args) {
        HelloThread t1 = new HelloThread();
        t1.start();
    }
}

