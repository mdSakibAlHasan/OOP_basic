package thread;

public class ThreadClass implements Runnable {
    private String message;
    public ThreadClass(String message){
        this.message = message;
    }
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(i+". This is call from "+message);
            //Thread.sleep(3000);

        }
    }
}

class Main{
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new ThreadClass("First class"));
        Thread thread2 = new Thread(new ThreadClass("Second class"));

        thread1.start();
        //Thread.sleep(3000);
        //thread1.join();
        thread2.start();

        for (int i=0;i<100;i++){
            System.out.println(i+". This is from main class");
            //Thread.sleep(3000);
        }

    }
}
