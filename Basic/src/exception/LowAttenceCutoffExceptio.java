package exception;

public class LowAttenceCutoffExceptio extends Exception{
    public LowAttenceCutoffExceptio(double cutoffAttence, String message){
        super(message+cutoffAttence);
    }
}
