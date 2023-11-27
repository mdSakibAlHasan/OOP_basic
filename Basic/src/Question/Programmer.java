package Question;

public class Programmer extends Profession{
    String rank;
    public Programmer(String name, String speciality, String designation, double age, double salay, String rank) {
        super(name, "ICT", designation, age, salay);
        this.rank = rank;
    }

    @Override
    public void jobDescription() {
        System.out.println("Do professional programming");
    }
}
