package exception;

public class InvalidCTScore extends Exception{
    public InvalidCTScore(int num){
        super("You need a minimum score in CT");
    }
}
