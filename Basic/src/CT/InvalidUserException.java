package CT;

public class InvalidUserException extends Exception{
    public InvalidUserException(int ID, String type){
        System.out.println(ID+" is not a valid "+type);
    }

    public InvalidUserException(int ID){
        System.out.println(ID+" is not a valid user ");
    }
}
