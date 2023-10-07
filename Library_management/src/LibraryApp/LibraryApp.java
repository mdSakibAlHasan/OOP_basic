package LibraryApp;

import library.Item;
import library.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        System.out.println("Are you librarian or member: \n 1.Librarian\t 2.general member");
        Scanner sc = new Scanner(System.in);
        int option =  sc.nextInt();
        if(option ==1){
            int choice=10000;
            while (choice !=0) {

                System.out.println("30. Add Book\n 40. Add Movie \n 50. Add Publication" +
                        " tInput ‘2’ to search for an item with itemId.\n" +
                        "\uF0A7\tInput ‘3’ to search for an item with title and author.\n" +
                        "\uF0A7\tInput ‘4’ to checkout an item.\n" +
                        "\uF0A7\tInput ‘5’ to extend the checkout time.\n" +
                        "\uF0A7\tInput ‘6’ to checkin an item.\n" +
                        "\uF0A7\tInput ‘7’ to view the checkout record of an item.\n" +
                        "\uF0A7\tInput ‘8’ to view the checkout record of a member.\n" +
                        "\uF0A7\tInput ‘9’ to display the list of specific types of items.\n" +
                        "\uF0A7\tInput ‘10’ to display the list of all items.\n" +
                        "\uF0A7\tInput ‘11’ to add member.\n" +
                        "\uF0A7\tInput 20 to switch role (until we save data in file)\n" +
                        "\uF0A7\tInput ‘0’ to exit the system.\n");
                 choice = sc.nextInt();
                 sc.nextLine();
                if(choice == 30){
                    System.out.println("Input tittle: ");
                    String title = sc.nextLine();
                    System.out.println("Input catagory: ");
                    String catagory = sc.nextLine();
                    System.out.println("Input authors: ");
                    String authors = sc.nextLine();
                    System.out.println("Input publication year: ");
                    int publicationYear = sc.nextInt();
                    System.out.println("Input publisherName: ");
                    String publisherName = sc.nextLine();

                    library.addItem(title,catagory,authors,publicationYear,publisherName);
                } else if (choice==40) {

                } else if (choice == 50) {

                } else if (choice == 3) {
                    System.out.println("Input tittle: ");
                    String tittle = sc.nextLine();
                    System.out.println("Input author: ");
                    String author = sc.nextLine();
                    ArrayList<Item> items =  library.findItems(tittle,author);
                    System.out.println(items+" print here");
                }
            }
        }
        else if(option == 2){
            System.out.println("\uF0A7\tInput ‘2’ to search for an item with itemId.\n" +
                    "\uF0A7\tInput ‘3’ to search for an item with title and author/director.\n" +
                    "\uF0A7\tInput ‘4’ to checkout an item.\n" +
                    "\uF0A7\tInput ‘5’ to extend the checkout time.\n" +
                    "\uF0A7\tInput ‘7’ to view the checkout status of an item.\n" +
                    "\uF0A7\tInput ‘8’ to view his/her checkout records.\n" +
                    "\uF0A7\tInput ‘9’ to display the list of specific types of items.\n" +
                    "\uF0A7\tInput ‘10’ to display the list of all items.\n" +
                    "\uF0A7\tInput 20 to switch role (until we save data in file)\n" +
                    "\uF0A7\tInput ‘0’ to exit the system. \n");
        }
    }
}
