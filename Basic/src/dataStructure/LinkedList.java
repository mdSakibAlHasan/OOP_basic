package dataStructure;

public class LinkedList {
    Node head;
    static class Node{
        String data;
        Node next;
        public Node(String data){
            this.data = data;
            this.next =null;
        }
    }

    public static void insertLast(LinkedList list, String data){
        Node new_node = new Node(data);

        if(list.head == null){
            list.head = new_node;
        }
        else {
            Node last_node = list.head;
            while (last_node.next != null){
                last_node = last_node.next;
            }
            last_node.next = new_node;
        }
    }

    public static void insertFirst(LinkedList list, String data){
        Node new_node = new Node(data);

        if(list.head == null){
            list.head = new_node;
        }
        else {

            new_node.next = list.head;
            list.head = new_node;

        }
    }

    public static void insertAtSpecificIndex(LinkedList list, String data, int index){
        Node new_node = new Node(data);
        if(list.head == null){
            list.head = new_node;
        }
        else {
            Node last_node = list.head,before_node;
           for(int i=0;last_node.next != null;i++){
               before_node = last_node;
                last_node = last_node.next;
                if(i == index-1){
                    before_node.next = new_node;
                    new_node.next = last_node;
                    return;
                }
            }
            System.out.println("Index is not valid");

        }
    }

    public static void deleteLast(LinkedList list){
        if(list.head == null){
            System.out.print("List is empty");
        }
        else {
            Node last_node = list.head, previous_node=null;
            while (last_node.next != null){
                previous_node = last_node;
                last_node = last_node.next;
            }
            previous_node.next = null;
        }
    }

    public static void deleteFirst(LinkedList list){
        if(list.head == null){
            System.out.println("List is empty");
        }
        else {
            Node second_node = list.head.next;
            list.head = second_node;

        }
    }

    public static void deleteAtSpecificIndex(LinkedList list, int index){
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


    public static void printList(LinkedList list){
        Node head = list.head;
        System.out.print(head.data+" ");
        while (head.next != null){
            head = head.next;
            System.out.print(head.data+" ");
        }
    }



    public static void main(String[] args) {
        System.out.println("This list add at first");
        LinkedList list = new LinkedList();
        LinkedList.insertFirst(list,"Rice");
        LinkedList.insertFirst(list,"Vegitable");
        LinkedList.insertFirst(list,"abc");
        LinkedList.insertFirst(list,"def");
        LinkedList.insertFirst(list,"as");
        LinkedList.printList(list);

        System.out.println("/n This list add lass:");
        LinkedList list2 = new LinkedList();
        LinkedList.insertLast(list2,"rice");
        LinkedList.insertLast(list2,"vegitable");
        LinkedList.insertLast(list2,"birani");
        LinkedList.insertLast(list2,"abc");
        LinkedList.insertLast(list2,"def");
        LinkedList.printList(list2);
        LinkedList.insertAtSpecificIndex(list2,"kacci",2);
        System.out.println("");
        LinkedList.printList(list2);
        LinkedList.deleteAtSpecificIndex(list2,2);
        System.out.println("");
        LinkedList.printList(list2);
        
//        LinkedList.deleteLast(list2);
//        System.out.println("");
//        LinkedList.printList(list2);
//
//        LinkedList.deleteFirst(list2);
//        System.out.println("");
//        LinkedList.printList(list2);



    }


}
