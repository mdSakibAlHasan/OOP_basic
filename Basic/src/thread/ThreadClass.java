package thread;

import java.util.ArrayList;

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


class Array{
    int[] ar = new int[4];

}

class ArrayInit implements Runnable{

    int index,max;
    Array array;
    public ArrayInit(int index, int max, Array array){
       this.max =max;
       this.index = index;
       this.array = array;
    }

    @Override
    public void run() {
         array.ar[index] =  max;
    }
}

class Main{
    public static void main(String[] args) throws InterruptedException {


//        Thread thread1 = new Thread(new ThreadClass("First class"));
//        Thread thread2 = new Thread(new ThreadClass("Second class"));
//
//        thread1.start();
//        //Thread.sleep(3000);
//        //thread1.join();
//        thread2.start();
//
//        for (int i=0;i<100;i++){
//            System.out.println(i+". This is from main class");
//            //Thread.sleep(3000);
//        }

        Array array = new Array();
        Thread thread1= new Thread(new ArrayInit(0,26,array));
        Thread thread2= new Thread(new ArrayInit(1,46,array));
        Thread thread3= new Thread(new ArrayInit(2,62,array));
        Thread thread4= new Thread(new ArrayInit(3,88,array));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread2.join();
        thread3.join();
        thread4.join();
        thread1.join();

        System.out.println(array.ar[0]+" "+array.ar[1]+" "+array.ar[2]+" "+array.ar[3]+" ");




    }
}
