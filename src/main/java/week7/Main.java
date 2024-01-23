package week7;

public class Main {
    public static void main(String[] args) {
        RecordLogger log1 = new RecordLogger("Iman");
        ClassLogger log2 = new ClassLogger("Belma");

        Logger loggedMessage1 = message -> log1.logMessage("Study");
        Logger loggedMessage2 = message -> log2.logMessage("No.");

        loggedMessage1.logMessage("Study");
        loggedMessage2.logMessage("No.");

    }
}
