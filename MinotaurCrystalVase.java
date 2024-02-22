import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MinotaurCrystalVase extends Thread {

    private static final int MAX_GUESTS = 100; // Maximum number of guests, change as needed
    private static Lock showroomLock = new ReentrantLock();
    private int id;

    public MinotaurCrystalVase(int id) {
        this.id = id;
    }

    public void run() {
        while (true) {
            showroomLock.lock(); // Try to enter the showroom
            try {
                // Simulate the time spent in the showroom
                System.out.println("Guest " + id + " is viewing the crystal vase.");
                Thread.sleep((long) (Math.random() * 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                showroomLock.unlock(); // Leave the showroom
            }
            try {
                Thread.sleep((long) (Math.random() * 3000)); // Simulate time before next attempt
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of guests (N): ");
        int n = Math.min(scanner.nextInt(), MAX_GUESTS); // Read number of guests

        for (int i = 0; i < n; i++) {
            new MinotaurCrystalVase(i).start(); // Start thread for each guest
        }
    }
}
