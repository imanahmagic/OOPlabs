package lab11task3;

public class UpperCaseFormatter implements TextFormatter{
    @Override
    public String formatText(String text){
        System.out.println(text.toUpperCase());
        return text;
    }
}
