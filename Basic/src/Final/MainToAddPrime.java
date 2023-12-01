package Final;

public class MainToAddPrime{
    public static void main(String[] args) throws InterruptedException {
        Array array = new Array();
        Thread thread1= new Thread(new ArrayInit(0,MainToAddPrime.primeNumber(50,80),array));
        Thread thread2= new Thread(new ArrayInit(1,MainToAddPrime.primeNumber(50,80),array));
        Thread thread3= new Thread(new ArrayInit(2,MainToAddPrime.primeNumber(50,80),array));
        Thread thread4= new Thread(new ArrayInit(3,MainToAddPrime.primeNumber(50,80),array));
        Thread thread5= new Thread(new ArrayInit(4,MainToAddPrime.primeNumber(50,80),array));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        thread2.join();
        thread3.join();
        thread4.join();
        thread1.join();
        thread5.join();

        System.out.println(array.ar[0]+" "+array.ar[1]+" "+array.ar[2]+" "+array.ar[3]+" "+array.ar[4]);

    }

     static int primeNumber(int min, int max){
        int  num = (int)(Math.random()*(max-min+1)+min);
        while (!isPrime(num)){
            num = (int)(Math.random()*(max-min+1)+min);
        }

        return  num;
    }

    public static boolean isPrime(int num){
        for(int i=2;i<=num/2;i++){
            if(num%i == 0){
                return false;
            }
        }

        return true;
    }

}

