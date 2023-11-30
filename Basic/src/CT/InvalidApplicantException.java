package CT;

public class InvalidApplicantException extends Exception{
    public InvalidApplicantException(int min, int max){
        System.out.println("Applicants who are between"+ min+" and " + max+ " years old are eligible for this position");
    }

    public InvalidApplicantException(int ID){
        System.out.println(ID+" is not a valid user ");
    }

}
