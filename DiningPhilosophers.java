 class Philosopher extends Thread {q
    private final Object leftFork, rightFork;

    public Philosopher(Object leftFork, Object rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    private void think() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " is thinking...");
        Thread.sleep(1000);
    }

    private void eat() throws InterruptedException {
        synchronized (leftFork) {
            synchronized (rightFork) {
                System.out.println(Thread.currentThread().getName() + " is eating...");
                Thread.sleep(1000);
            }
        }
    }

    public void run() {
        try {
            while (true) {
                think();
                eat();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class DiningPhilosophers {
    public static void main(String[] args) {
        int numPhilosophers = 5;
        Object[] forks = new Object[numPhilosophers];
        Philosopher[] philosophers = new Philosopher[numPhilosophers];

        for (int i = 0; i < numPhilosophers; i++) {
            forks[i] = new Object();
        }

        for (int i = 0; i < numPhilosophers; i++) {
            Object leftFork = forks[i];
            Object rightFork = forks[(i + 1) % numPhilosophers];

            // Avoid circular deadlock by making the last philosopher pick up forks in reverse order
            if (i == numPhilosophers - 1) {
                philosophers[i] = new Philosopher(rightFork, leftFork);
            } else {
                philosophers[i] = new Philosopher(leftFork, rightFork);
            }

            philosophers[i].start();
        }
    }
}