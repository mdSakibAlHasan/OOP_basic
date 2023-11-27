package Question;

public class Encpssulation extends Voter{
    private String name;
    private int age;

    public Encpssulation(String name, int age){
        super(name,age);
        this.name = name;
        this.age     = age;
    }

    @Override
    public void  grow(){
        age++;
    }

    public int getAge() {
        return age;
    }
}
