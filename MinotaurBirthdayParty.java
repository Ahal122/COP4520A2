import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class MinotaurBirthdayParty extends Thread {

    private static final int MAX_GUESTS = 100; // Maximum number of guests, change as needed
    private static AtomicInteger guestsWhoAteCupcake = new AtomicInteger(0);
    private static AtomicBoolean[] visited;
    private static AtomicBoolean cupcakeAvailable = new AtomicBoolean(true);
    private int id;

    public MinotaurBirthdayParty(int id) {
        this.id = id;
    }

    public void run() {
        while (guestsWhoAteCupcake.get() < visited.length) {
            if (!visited[id].get() && cupcakeAvailable.getAndSet(false)) { // Guest enters the labyrinth
                visited[id].set(true); // Mark as visited
                guestsWhoAteCupcake.incrementAndGet(); // Eat cupcake only if not done before
                cupcakeAvailable.set(true); // Leave or place new cupcake
            }
            try {
                Thread.sleep((long) (Math.random() * 100)); // Simulate time spent in the labyrinth
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of guests (N): ");
        int n = Math.min(scanner.nextInt(), MAX_GUESTS); // Read number of guests
        visited = new AtomicBoolean[n];

        for (int i = 0; i < n; i++) {
            visited[i] = new AtomicBoolean(false);
        }

        for (int i = 0; i < n; i++) {
            new MinotaurBirthdayParty(i).start(); // Start thread for each guest
        }
    }
}
