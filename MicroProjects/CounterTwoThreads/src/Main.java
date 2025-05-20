public class Main {

    public static void main(String[] args) {
        Thread counter = new Thread(new Conter("Fast Counter", 500));
        Thread counter1 = new Thread(new Conter("Slow Counter", 1500));
        counter.start();
        counter1.start();

        try {
            Thread.sleep(5000L);
        } catch (InterruptedException var4) {
            var4.printStackTrace();
        }

        counter.interrupt();
        counter1.interrupt();
    }

    static class Conter implements Runnable {
        private final String name;
        private final int delay;
        private int count;

        Conter(String name, int delay) {
            this.name = name;
            this.delay = delay;
            this.count = 0;
        }

        public void run() {
            while(true) {
                try {
                    if (!Thread.currentThread().isInterrupted()) {
                        ++this.count;
                        System.out.printf("%s: %d\n", this.name, this.count);
                        Thread.sleep((long)this.delay);
                        continue;
                    }
                } catch (InterruptedException var2) {
                    System.out.println(this.name + "was interrupted");
                }

                System.out.println(this.name + " finished");
                return;
            }
        }
    }
}
