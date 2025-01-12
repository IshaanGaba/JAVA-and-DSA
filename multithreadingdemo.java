

public class MultithreadingDemo {
    static class Counter extends Thread {
        private String threadName;
    
        public Counter(String threadName) {
            this.threadName = threadName;
        }
    
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " counting: " + i);
                try {
                    Thread.sleep(500); // Simulate a delay
                } catch (InterruptedException e) {
                    System.out.println(threadName + " interrupted.");
                }
            }
            System.out.println(threadName + " finished.");
        }
    }
    public static void main(String[] args) {
        // Creating threads
        Counter thread1 = new Counter("Thread-1");
        Counter thread2 = new Counter("Thread-2");
        Counter thread3 = new Counter("Thread-3");

        // Starting threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
