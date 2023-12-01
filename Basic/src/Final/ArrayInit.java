package Final;

import java.util.Random;

public class ArrayInit implements Runnable{
    int index,num;
    Array array;
    public ArrayInit(int index, int num, Array array){
        this.num =num;
        this.index = index;
        this.array = array;
    }

    @Override
    public void run() {
        array.ar[index] =  num;
    }
}

class Array{
    int[] ar = new int[5];
}

class Main{
    public static void main(String[] args) throws InterruptedException {
        Array array = new Array();
        Thread thread1= new Thread(new ArrayInit(0,Main.randomNumber(20,30),array));
        Thread thread2= new Thread(new ArrayInit(1,Main.randomNumber(40,50),array));
        Thread thread3= new Thread(new ArrayInit(2,Main.randomNumber(60,70),array));
        Thread thread4= new Thread(new ArrayInit(3,Main.randomNumber(80,90),array));

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

    public static int randomNumber(int min, int max){
        int num=1;
        while (num%2!=0){
            num = (int)(Math.random()*(max-min+1)+min);
        }

        return  num;
    }
}
