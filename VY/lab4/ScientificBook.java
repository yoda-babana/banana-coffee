class ScientificBook extends Book {
    private int price;
    private String publisher;

    public ScientificBook() {}

    public ScientificBook(String name, String code, int pages, int price, String publisher) {
        super(name, code, pages);
        this.price = price;
        this.publisher = publisher;
    }

    @Override
    public String getBookData() {

        return super.getBookData() + ", Price: " + price + ", Publisher: " + publisher;
    }

}