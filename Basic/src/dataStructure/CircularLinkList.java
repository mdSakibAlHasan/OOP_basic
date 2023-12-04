package dataStructure;

import java.util.Scanner;

public class CircularLinkList {

        Node head;

        static class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }


        public static void insert(CircularLinkList list) {
            System.out.print("Input your data: ");
            Scanner scn = new Scanner(System.in);
            int data = scn.nextInt();

            Node new_node, ptr;
            new_node = new Node(data);
            new_node.next = list.head;
            ptr = list.head;

            if (ptr != null) {
                while (ptr.next != list.head) {
                    ptr = ptr.next;
                }
                ptr.next = new_node;
            } else {
                list.head = new_node;
                new_node.next = list.head;
            }
        }

        public static void insertFirst(dataStructure.LinkedList list) {
            System.out.print("Input your data: ");
            Scanner scn = new Scanner(System.in);
            int data = scn.nextInt();

            dataStructure.LinkedList.Node ptr = new dataStructure.LinkedList.Node(data);
            ptr.next = list.head;
            list.head = ptr;
            //System.out.println(list.head.data);
        }

        public static void insertAtSpecificIndex(dataStructure.LinkedList list) {
            System.out.print("Input your data: ");
            Scanner scn = new Scanner(System.in);
            int data = scn.nextInt();
            System.out.println("Input info after you insert: ");
            int info = scn.nextInt();

            dataStructure.LinkedList.Node new_node, ptr;
            new_node = new dataStructure.LinkedList.Node(data);
            ptr = list.head;

            while (ptr != null && ptr.data != info) {
                ptr = ptr.next;
            }

            if (ptr.data == info) {
                new_node.next = ptr.next;
                ptr.next = new_node;
            } else {
                System.out.println("Invalid number");
            }
        }

        public static void deleteLast(CircularLinkList list) {
            Node ptr, prep = null;
            if (list.head == null) {
                System.out.print("List is empty");
            } else if (list.head.next == list.head) {
                list.head = null;
            } else {
                ptr = list.head;
                while (ptr.next != list.head) {
                    prep = ptr;
                    ptr = ptr.next;
                }
                prep.next = list.head;
                ptr = null;
            }
        }

        public static void deleteFirst(dataStructure.LinkedList list) {
            dataStructure.LinkedList.Node ptr;
            if (list.head == null) {
                System.out.println("List is already empty");
            } else {
                ptr = list.head;
                list.head = list.head.next;
                ptr = null;
            }
        }

        public static void deleteAtSpecificIndex(CircularLinkList list) {
            System.out.print("Input your data: ");
            Scanner scn = new Scanner(System.in);
            int data = scn.nextInt();

            if (list.head == null) {
                System.out.println("List is empty");
            } else {
                Node ptr = list.head, pre_node = null;
                for (int i = 0; ptr.next != list.head; i++) {

                    if (ptr.data == data) {
                        pre_node.next = ptr.next;
                        return;
                    }
                    pre_node = ptr;
                    ptr = ptr.next;
                }
                System.out.println("Index is not valid");

            }
        }


        public static void printList(CircularLinkList list) {
            if (list.head == null) {
                System.out.println("List is empty");
                return;
            }
            System.out.print("List is: ");
            Node head = list.head;
            System.out.print(head.data + " ");
            while (head.next != list.head) {
                head = head.next;
                System.out.print(head.data + " ");
            }
            System.out.println("");
        }


        public static void main(String[] args) {
            System.out.println("*******Main Menue**********");
            int option = 0;
            CircularLinkList list = new CircularLinkList();
            while (option != -1) {
                System.out.println("Chocse one option");
                System.out.println("1.Insert at first \n 2.Insert at Last \n 3.delete fat specific \n 4.delete from last \n 5.view list \n6.Inster at specific" +
                        " \n -1.exit");

                //CircularLinkList.insert(list);


                Scanner sc = new Scanner(System.in);
                option = sc.nextInt();


                switch (option) {
                    case 1:
                        CircularLinkList.insert(list);
                        break;
//                    case 2:
//                        dataStructure.LinkedList.insertLast(list);
//                        break;
//                    case 3:
//                        dataStructure.LinkedList.deleteFirst(list);
//                        break;
                    case 4:
                        CircularLinkList.deleteLast(list);
                        break;
                    case 3:
                        CircularLinkList.deleteAtSpecificIndex(list);
                        break;
//                    case 6:
//                        dataStructure.LinkedList.insertAtSpecificIndex(list);
//                        break;
                    case 5:
                        CircularLinkList.printList(list);
                        break;

               }
            }


        }


    }


