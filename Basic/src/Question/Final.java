package Question;

import java.util.Scanner;

public class Final {
    public static boolean isPrime(int x){
        for(int i=2;i<=x/2;i++){
            if(x%i == 0)
                return false;
        }
       // System.out.println("x "+x);
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int input, sum=0;
//        for(int i=0;i<5;i++){
//            input = sc.nextInt();
//            if(input%2 == 1){
//                sum += input;
//            }
//        }
//        System.out.println("SUm is "+sum);

        int input, sum=0;
        for(int i=0;i<6;i++){
            input = sc.nextInt();
            if(isPrime(input)){
                sum += input;
            }
        }
        System.out.println("SUm is "+sum);
    }
}
