package week7;

public record RecordLogger(String name) implements Logger {
    @Override
    public void logMessage(String message){
        System.out.println("[ " + this.name + " ]" + ": " + message);;
    }

}
