package week5;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(10);
        box.add(new Book("Fyodor", "Crime and punishment", 2));
        box.add(new Book("Jane", "Pride and Prejudice", 0.9));
        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));

        System.out.println(box);
    }
}

