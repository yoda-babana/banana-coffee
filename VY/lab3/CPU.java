public class CPU {
    String name;
    int RAM;
    double frequency;

    public CPU() {
        this.name = "Intel";
        this.RAM = 4096;
        this.frequency = 2.7;
    }

    public CPU(String name, int RAM, double frequency) {
        this.name = name;
        this.RAM = RAM;
        this.frequency = frequency;
    }

    public String getCPUData() {
        return "Name: " + name + ", RAM: " + RAM + " MB, Frequency: " + frequency + " GHz";
    }
}

