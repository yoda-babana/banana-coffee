import java.util.Scanner;

public class Book {
    protected String name;
    protected String code;
    protected int pages;

    public Book() {}

    public Book(String name, String code, int pages) {
        this.name = name;
        this.code = code;
        this.pages = pages;
    }

    public String getBookData() {

        return "Name: " + this.name + ", Code: " + this.code + ", Pages: " + this.pages;
    }

    public int getSize(){
        return this.pages;

    }
    public String getName(){
        return this.name;

    }
    public String getCode(){
        return this.code;

    }

}



