package exception;

import javax.script.ScriptContext;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Divition {
    public static void main(String[] args) throws Exception {

        File file = new File("exception/abc.txt");
        Scanner sc = new Scanner(file);
        String s = sc.nextLine();
        System.out.println(s);
        try{


            int[] array= new   int[2];
            array[0] =2;
            array[1]=3;
            System.out.println("Before exception");
            //array[2] = 4;
            System.out.println("after exception");
            Scanner abc = new Scanner(System.in);
            int ran = abc.nextInt();


//            if(ran>100)
//                throw new NumberLimit("Number should be less than 100");
//            System.out.println("GCD: hsfhbskjv");
        }catch (Exception be){
            System.out.println(be);
        }finally {
            System.out.println("Final block executed");
        }




//            Scanner input = new Scanner(System.in);
//            int a = input.nextInt();
//            int b = input.nextInt();
//            if(b==0)
//                throw new ArithmeticException("divide by zero");
//            else
//                System.out.println("Result is "+(a/b));



//
//
//
//        System.out.println("last");
    }
}