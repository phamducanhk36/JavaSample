package sample.transients;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TransientSample {
    public static void main(String[] arg) throws Exception {
        Book book = new Book();
        book.setBookName("Java Reference");
        book.setDescription("will not be saved");
        book.setCopies(25);
        System.out.println(book.toString());
        serialize(book);
        Book book1 = deserialize();
        System.out.println(book1.toString());
    }
    public static void serialize(Book book) throws Exception {
        FileOutputStream file = new FileOutputStream("fileName.txt");
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(book);
        out.close();
        file.close();
    }
    public static Book deserialize() throws Exception {
        FileInputStream file = new FileInputStream("fileName.txt");
        ObjectInputStream in = new ObjectInputStream(file);
        Book book = (Book) in.readObject();
        in.close();
        file.close();
        return book;
    }
}


class Book implements Serializable {
    private static final long serialVersionUID = -2936687026040726549L;
    private String bookName;
    private transient String description;
    private transient int copies;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    @Override
    public String toString() {
        return "{" +
                "\"bookName\":\"" + bookName + '\"' +
                "; \"description\":\"" + description + '\"' +
                "; \"copies\":" + copies +
                '}';
    }
    // getters and setters
}
