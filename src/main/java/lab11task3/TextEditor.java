package lab11task3;

public class TextEditor {
    private TextFormatter tf;

    public void setTf(TextFormatter tf) {
        this.tf = tf;
    }
    public String formatText(String text){
        if(tf == null){
            throw new IllegalStateException("Text is not set");
        }
        return tf.formatText(text);
    }
}


