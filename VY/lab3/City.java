class City {
    private String name;
    private int countOfPharmacy;
    private Pharmacy[] pharmacies;

    public City(String name, int countOfPharmacy, Pharmacy[] pharmacies) {
        this.name = name;
        this.countOfPharmacy = countOfPharmacy;
        this.pharmacies = pharmacies;
    }

    public Drug getMostExpensiveDrugInCity() {
        Drug mostExpensive = pharmacies[0].getMostExpensiveDrug();
        for (Pharmacy pharmacy : pharmacies) {
            Drug mostExpensiveInPharmacy = pharmacy.getMostExpensiveDrug();
            if (mostExpensiveInPharmacy.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = mostExpensiveInPharmacy;
            }
        }
        return mostExpensive;
    }

    public String getName() {
        return name;
    }
}
