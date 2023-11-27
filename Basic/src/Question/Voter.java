package Question;

public class Voter {
    private String name;
    private int age;

    public Voter(String name, int age){
        this.name = name;
        this.age     = age;
    }

    public void  grow(){
        age++;
    }
}
