package week4;

public class Student extends Person{
    private int credits =0;

    public Student(String name, String address){
        super(name, address);
    }
    public Student(int credits){
        super(" ", " ");
        this.credits = credits;
    }
    public int getCredits(){
        return this.credits;
    }
    public void setCredits(int credits){
        this.credits = credits;
    }
    void study(){
        credits++;
    }
}
