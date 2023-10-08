package exception;

import jdk.jshell.EvalException;

import java.util.Scanner;

public class RangeCode {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        //valid(200);
        //mathFun(4);
        System.out.println("Answer: "+mathSquare(num));
    }
    public static void valid(int num) throws Exception {
        if(num > 0 && num <100){
            System.out.println("correct");
        }else {
            throw new Exception("Number should 0 to 100");
        }
    }
    public static int mathFun(int num) throws Exception {
        if(num%2 != 0){
            throw new Exception("Not a even number");
        }
        else{
            return  num/2;
        }
    }
    public static double mathSquare(double num) throws Exception {
        if(num< 0){
            //throw new LowAttenceCutoffExceptio(80,"You need minimum attendence ");
            throw new Exception("Can't find square root");
        }
        else{
            return  Math.sqrt(num);
        }
    }
}
