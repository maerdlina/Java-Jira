package examples.First;

public class Cout {
    public static void main(String[] args) {
        Printer printer1 = new Printer("Коля");
        Thread thread1 = new Thread(printer1);
        thread1.start();

        Printer printer2 = new Printer("Вася");
        Thread thread2 = new Thread(printer2);
        thread2.start();
    }
}
