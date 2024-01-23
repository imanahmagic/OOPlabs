package week7;

public class ClassLogger implements Logger{
    private String name;

    public ClassLogger(String name){
        this.name = name;
    }
    @Override
    public void logMessage(String message){
        System.out.println("[ " + this.name + " ]" + ": " + message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
