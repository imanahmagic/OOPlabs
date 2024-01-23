package lab11;

public class Logger {
    private static Logger instance;

    private Logger(){}

    public static Logger getInstance() {
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public static void setInstance(Logger instance) {
        Logger.instance = instance;
    }
    public void log(String message){
        System.out.println(message);
    }
    public void logInfo(String message){
        System.out.println(message);
    }
    public void logWarning(String message){
        System.out.println(message);
    }
    public void logError(String message){
        System.out.println(message);
    }

}
