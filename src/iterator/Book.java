package iterator;

public class Book {
    private String name;

    public Book(String name) {
        // 불변 객체, setter X
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
