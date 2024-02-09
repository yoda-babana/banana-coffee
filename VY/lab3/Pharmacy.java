class Pharmacy {
    private String name;
    private int countOfDrugs;
    private Drug[] drugs;

    public Pharmacy(String name, int countOfDrugs, Drug[] drugs) {
        this.name = name;
        this.countOfDrugs = countOfDrugs;
        this.drugs = drugs;
    }

    public Drug getMostExpensiveDrug() {
        Drug mostExpensive = drugs[0];
        for (Drug drug : drugs) {
            if (drug.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = drug;
            }
        }
        return mostExpensive;
    }

    public String getName() {
        return name;
    }
}
