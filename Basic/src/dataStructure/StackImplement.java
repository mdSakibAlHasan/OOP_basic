package dataStructure;

import java.util.Stack;

public class StackImplement {
    static class Stack{
        int size,index=0;
        int[] array;
        public Stack(int size){
            this.size = size;
            array = new int[size];
        }


        public void push(int data){
            if(index == size-1){
                System.out.println("Stack is full");
            }
            else{
                System.out.println("push: "+data);
                array[index++] = data;
            }
        }

        public int pop(){
            if(index == 0){
                System.out.println("Stack is empty");
                return -1;
            }
            else{
                System.out.println("pop: "+array[index]);
               return array[index--];
            }
        }
        public void printStack(){
            System.out.println("Stack is: ");
            for(int i=0;i<=index;i++){
                System.out.print(array[i]+" ");
            }
            System.out.println("");
        }

        public static void main(String[] args) {
            Stack stack = new Stack(3);
            stack.push(2);
            stack.push(6);
            stack.push(1);
            stack.push(7);

            stack.printStack();

            stack.pop();
            stack.pop();
            stack.printStack();
            stack.pop();
            stack.pop();
        }
    }


}
