package CT;

public class CheckStringCT {
    public static void checkString(String str) throws Exception {           ////sec A part -1
        if(str.contains("ab")){
            throw new Exception("Contains ab");
        }
    }

    public static void checkString2(String str) throws Exception {      //sec A part -2
        if(str.length()<4){
            throw new Exception("String less than four");
        }
    }

}
