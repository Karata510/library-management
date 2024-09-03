public class Book {
    private String name;
    private String ISBN;
    private int id;
    private String Author;

    public Book(String name, String ISBN, int id, String author) {
        this.name = name;
        this.ISBN = ISBN;
        this.id = id;
        Author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", ISBN=" + ISBN + ", id=" + id + ", Author=" + Author + "]";
    }

    
}
