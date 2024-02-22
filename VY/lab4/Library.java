public class Library {
    private String name;
    private String city;
    private String country;
    private Book[] books = new Book[100];
    private int sizeOfBooks = 0;

    public Library() {}

    public Library(String name, String city, String country) {
        this.name = name;
        this.city = city;
        this.country = country;
    }

    public void addBook(Book b) {
        books[sizeOfBooks++] = b;
    }

    public void printLibraryData() {
        System.out.println("Library: " + name + ", Location: " + city + ", " + country);
        System.out.println("Books available:");
        for (int i = 0; i < sizeOfBooks; i++) {
            System.out.println(books[i].getBookData());
        }
    }

    public  int getSizeOfBooks(){
        return this.sizeOfBooks;
    }
    public  Book[] getBooks(){
        return this.books;
    }
}

