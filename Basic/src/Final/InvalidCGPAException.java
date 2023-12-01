package Final;

public class InvalidCGPAException extends Exception{
    public InvalidCGPAException(double minCg, double maxCg){
        System.out.println("Valid CGPA should be between "+minCg+" to "+maxCg);
    }
}
