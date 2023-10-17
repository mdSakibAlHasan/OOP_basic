package inputOutput;

import java.io.*;
import java.util.Scanner;

public class ReadWrite {
    Book book1 = new Book("Physics","Topon","NCTB");
    Book book2 = new Book("Chemistry","Hazari","NCTB");

    public void write(){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data.txt"));
            bufferedWriter.write(book1.getBookName()+"\n");
            bufferedWriter.write(book1.getAuthor()+"\n");
            bufferedWriter.write(book1.getCatagory()+"\n");
            bufferedWriter.write(book2.getBookName()+"\n");
            bufferedWriter.write(book2.getAuthor()+"\n");
            bufferedWriter.write(book2.getCatagory()+"\n");
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeScanner(){
        try {
            Scanner sc = new Scanner(System.in);
            FileOutputStream file = new FileOutputStream("data1.txt");
            for(int i=0;i<book1.getBookName().length();i++)
                file.write(book1.getBookName().charAt(i));
            //file.write(Integer.parseInt(book1.getCatagory()+"\n"));
//            file.write(book2.getBookName()+"\n");
//            file.write(book1.getBookName()+"\n");
//            file.write(book2.getAuthor()+"\n");
//            file.write(book2.getCatagory()+"\n");
//            bufferedWriter.flush();
//            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void fileWriter(){
        try {
            FileWriter fileWriter = new FileWriter(new File("data1.txt"));
            fileWriter.write(book1.getBookName());
                //ekhane flush dite hoy na.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void bufferRead(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"));
            String line = new String();

            String bookName = bufferedReader.readLine();
            String author = bufferedReader.readLine();
            String catagory = bufferedReader.readLine();
            Book book1 = new Book(bookName,author,catagory);
             bookName = bufferedReader.readLine();
             author = bufferedReader.readLine();
             catagory = bufferedReader.readLine();
            Book book2 = new Book(bookName,author,catagory);
            System.out.println(book1+"\n");
            System.out.println(book2+"\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void serizeClass(){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("’data_ser.txt");
            ObjectOutputStream objS = new ObjectOutputStream(fileOutputStream);
            objS.writeObject(book1);
            objS.writeObject(book2);
            objS.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void deSerialize(){
        try {
            FileInputStream fileInputStream = new FileInputStream("’data_ser.txt");
            ObjectInputStream objS = new ObjectInputStream(fileInputStream);
            Book book1 = (Book) objS.readObject();
            Book book2 = (Book) objS.readObject();

            System.out.println(book1+"  "+book2);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        ReadWrite readWrite = new ReadWrite();
        //readWrite.write();
        //readWrite.writeScanner();
        //readWrite.fileWriter();
        //readWrite.bufferRead();
        //readWrite.serizeClass();
        readWrite.deSerialize();
    }

}
