package task.fourth;

public class FourtTask implements Runnable {

    public void run(){
        Thread.currentThread().getStackTrace();
        for(StackTraceElement ste: Thread.currentThread().getStackTrace()) System.out.println(ste);
    }

    public static void main(String[] args){
        FourtTask specialThread = new FourtTask();
        Thread thread = new Thread(specialThread);
        thread.start();
        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
    }
}
