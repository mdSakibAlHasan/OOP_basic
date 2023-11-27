package Question;

public abstract class Profession {
    String name, speciality, designation;
    double age, salay;
    public Profession(String name, String speciality, String designation, double age, double salay){
        this.name = name;
        this.designation = designation;
        this.speciality= speciality;
        this.age= age   ;
        this.salay = salay;
    }

    public void promotion(String newDesignation, double salary){
        this.designation = designation;
        this.salay = salay;
    }

    public abstract void jobDescription();

    @Override
    public String toString() {
        return name+" "+age+" "+salay;
    }
}
