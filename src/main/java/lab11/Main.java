package lab11;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Application started");
        logger.logInfo("Initializing components");
        logger.logWarning("Memory running low");
        logger.logError("Critical error occurred");

        Logger.getInstance().log("Application closing");
    }
}
