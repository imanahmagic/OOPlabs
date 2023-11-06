package week5;

public class Book implements ToBeStored{
    private String writer;
    private String name;
    private double weight;

    public Book(String writer, String name, double weight){
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
    @Override
    public double weight(){
        return 0;
    }

    public String toString(){
        return this.writer + ": " + this.name;
    }
}
