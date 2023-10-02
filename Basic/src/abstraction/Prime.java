package abstraction;

import java.util.PrimitiveIterator;

public class Prime {
     public  int num=6;
    public  void reduce(){
        num--;
        System.out.println("Number is "+num);
    }

    public static void main(String[] args) {
        Prime prime1 = new Prime();
        Prime prime2 = new Prime();

        prime1.reduce();
        //prime1.reduce();

        prime2.reduce();
    }
}
