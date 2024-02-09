class Drug {
    private String name;
    private int price;
    private String outOfDate;

    public Drug(String name, int price, String outOfDate) {
        this.name = name;
        this.price = price;
        this.outOfDate = outOfDate;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}



