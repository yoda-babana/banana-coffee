
public class Laptop_task4 {
    String name;
    int price;
    int generation_of_CPU;
    String ssd;

    public Laptop_task4() {
        this.name = "";
        this.price = 0;
        this.generation_of_CPU = 0;
        this.ssd = "";
    }

    public Laptop_task4(String name, int price, int generation_of_CPU, String ssd) {
        this.name = name;
        this.price = price;
        this.generation_of_CPU = generation_of_CPU;
        this.ssd = ssd;
    }

    public void calculateNewPrice() {
        double newPrice = price;

        if (generation_of_CPU == 7) {
            newPrice += 0.10 * price; // Add 10% for 7th gen CPU
        } else if (generation_of_CPU == 8) {
            newPrice += 0.15 * price; // Add 15% for 8th gen CPU
        } else if (generation_of_CPU == 9) {
            newPrice += 0.20 * price; // Add 20% for 9th gen CPU
        }

        if (ssd.equals("YES")) {
            newPrice += 0.15 * price; // Add 15% for SSD
        }

        System.out.println(name + " " + (int) newPrice);
    }
}





