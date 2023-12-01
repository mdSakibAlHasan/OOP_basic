package Final;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MultiTryCatch {
    public static void main(String[] args)  {


        try{
            try {
                File file = new File("src/Final/abc.txt");          //IOException
                Scanner sc = new Scanner(file);


                int[] array= new   int[2];
                array[0] =2;
                array[1]=3;
                System.out.println("Before exception");
                array[2] = 4;                           //ArrayIndexOutOfBoundsException Excepton
                System.out.println("after exception");
                Scanner abc = new Scanner(System.in);
                int ran = abc.nextInt();

            }catch (IOException e){
                System.out.println("File exception found");
            }


        }catch (ArrayIndexOutOfBoundsException be){
            System.out.println(be);
        }finally {
            System.out.println("Final block executed");
        }


        System.out.println("last");
    }
}
