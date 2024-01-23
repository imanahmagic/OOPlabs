package lab11task3;

public class LowerCaseFormatter implements TextFormatter{
    @Override
    public String formatText(String text){
        System.out.println(text.toLowerCase());
        return text;
    }
}
