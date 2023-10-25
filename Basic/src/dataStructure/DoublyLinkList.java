package dataStructure;

import java.util.Scanner;

public class DoublyLinkList {
   Node head, tail;
    static class Node{
        int data;
        Node prev, next;
        public Node(int data){
            this.prev = null;
            this.data = data;
            this.next =null;
        }
    }



    public static void insertLast(DoublyLinkList list){
        System.out.print("Input your data: ");
        Scanner scn = new Scanner(System.in);
        int data = scn.nextInt();

        Node new_node, ptr;
        new_node = new Node(data);
        new_node.next = null;
        ptr = list.head;

        if(ptr != null){
            while (ptr.next != null){
                ptr = ptr.next;
            }
            ptr.next = new_node;
            new_node.prev = ptr;
            list.tail = new_node;
        }
        else{
            list.head = new_node;
            list.tail = new_node;
        }
    }

    public static void insertFirst(DoublyLinkList list){
        System.out.print("Input your data: ");
        Scanner scn = new Scanner(System.in);
        int data = scn.nextInt();

        Node ptr = new Node(data);
        if(list.head != null){
            ptr.next = list.head;
            list.head.prev = ptr;
            list.head = ptr;
        }
        else{
            list.head = ptr;
            list.tail = ptr;
        }

        //System.out.println(list.head.data);
    }

    public static void insertAtSpecificIndex(DoublyLinkList list){
        System.out.print("Input your data: ");
        Scanner scn = new Scanner(System.in);
        int data = scn.nextInt();
        System.out.println("Input info after you insert: ");
        int info = scn.nextInt();

        Node new_node, ptr;
        new_node = new Node(data);
        ptr = list.head;

        while ( ptr != null && ptr.data != info ){
            ptr = ptr.next;
        }

        if(ptr.data == info){
            new_node.next = ptr.next;
            ptr.next = new_node;
            new_node.next.prev = new_node;
            new_node.prev = ptr;
        }else{
            System.out.println("Invalid number");
        }
    }

    public static void deleteLast(DoublyLinkList list){
        Node ptr, prep=null;
        if(list.head == null){
            System.out.print("List is empty");
        }else if(list.head.next == null ){
            list.head = null;
        }
        else {
            ptr = list.head;
            while (ptr.next != null){
                prep = ptr;
                ptr = ptr.next;
            }
            prep.next = null;
            list.tail = prep;
           // ptr = null;
        }
    }

    public static void deleteFirst(DoublyLinkList list){
        Node ptr;
        if(list.head == null){
            System.out.println("List is already empty");
        }
        else {
            //ptr = list.head;
            list.head = list.head.next;
            list.head.prev = null;
           // ptr = null;
        }
    }

    public static void deleteAtSpecificIndex(DoublyLinkList list, int index){

        if(list.head == null){
            System.out.println("List is empty");
        }
        else {
            Node last_node = list.head,before_node=null;
            for(int i=0;last_node.next != null;i++){

                if(i == index){
                    before_node.next = last_node.next;
                    return;
                }
                before_node = last_node;
                last_node = last_node.next;
            }
            System.out.println("Index is not valid");

        }
    }


    public static void printList(DoublyLinkList list){
        if(list.head == null){
            System.out.println("List is empty");
            return;
        }
        System.out.print("List is: ");
        Node head = list.head;
        System.out.print(head.data+" ");
        while (head.next != null){
            head = head.next;
            System.out.print(head.data+" ");
        }
        System.out.println("");

        System.out.print("Reverse list: ");
        Node tail = list.tail;
        System.out.print(tail.data+" ");
        while (tail.prev != null){
            tail = tail.prev;
            System.out.print(tail.data+" ");
        }
        System.out.println("");
    }



    public static void main(String[] args) {
        System.out.println("*******Main Menue**********");
        int option=0;
        DoublyLinkList list = new DoublyLinkList();
        while(option != -1) {
            System.out.println("Chocse one option");
            System.out.println("1.Insert at first \n 2.Insert at Last \n 3.delete from first \n 4.delete from last \n 5.view list \n6.Inster at specific" +
                    " \n -1.exit");

            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();

            switch (option) {
                case 1:
                    DoublyLinkList.insertFirst(list);
                    break;
                case 2:
                    DoublyLinkList.insertLast(list);
                    break;
                case 3:
                    DoublyLinkList.deleteFirst(list);
                    break;
                case 4:
                    DoublyLinkList.deleteLast(list);
                    break;
                case 6:
                   DoublyLinkList.insertAtSpecificIndex(list);
                    break;
                case 5:
                    DoublyLinkList.printList(list);
                    break;

            }
        }


    }
}
