package exception;

public class InvalidException extends Exception{
    public InvalidException(int max, int min){
        super("Application whoi are between "+max + " and "+min+ " age are valid");
    }

    public  InvalidException(String qualification){
        super(qualification);
    }
}

class application{
    public void voter(int age) throws InvalidException{
        if(age<18){
            throw new InvalidException(18,60);
        }
        else if(age ==0){
            throw new InvalidException("age must be provided");
        }
    }

    public void ChedkString(String str) throws Exception {
        if(str.length()<4){
            throw new Exception("must be 4 or greater");
        }
    }
}
