package exception;

import javax.script.ScriptContext;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Divition {
    public static void main(String[] args)  {


        try{
            try {
                File file = new File("src/exception/abc.txt");          //IOException
                Scanner sc = new Scanner(file);
                String s = sc.nextLine();
                System.out.println(s);



                int[] array= new   int[2];
                array[0] =2;
                array[1]=3;
                System.out.println("Before exception");
                array[2] = 4;                           //ArrayIndexOutOfBoundsException Excepton
                System.out.println("after exception");
                Scanner abc = new Scanner(System.in);
                int ran = abc.nextInt();

            }catch (IOException e){
                System.out.println("handle");
            }


//            if(ran>100)
//                throw new NumberLimit("Number should be less than 100");
//            System.out.println("GCD: hsfhbskjv");
        }catch (ArrayIndexOutOfBoundsException be){
            System.out.println(be);
        }finally {
            System.out.println("Final block executed");
        }




//            Scanner input = new Scanner(System.in);
//            double a = input.nextDouble();
//            double b = input.nextDouble();
//            if(b==0)
//                throw new ArithmeticException("divide by zero is not allow");     //arithmatic exception
//            else
//                System.out.println("Result is "+(a/b));






        System.out.println("last");
    }
}
