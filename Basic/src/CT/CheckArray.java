package CT;

import java.io.IOException;

public class CheckArray {
//    public static void main(String[] args) throws NegetiveException {
//        int[] array ={0,1,-2,3,4};
//        for(int a: array){
//            if(a<0){
//                throw new NegetiveException();
//            }
//        }
//    }

    public static void main(String[] args) throws IOException {
        int[] array ={0,1,-2,3,4};
        for(int a: array){
            if(a%2 == 1){
                try {
                    throw new NegetiveException();
                } catch (NegetiveException e) {
                    throw new IOException();
                }
            }
        }
    }
}
