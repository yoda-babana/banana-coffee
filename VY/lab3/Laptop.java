public class Laptop {
    String name;
     int HDDMemory;
     CPU processor;

    public Laptop() {
        this.name = "";
        this.HDDMemory = 0;
        this.processor = new CPU();
    }

    public Laptop(String name, int HDDMemory, CPU processor) {
        this.name = name;
        this.HDDMemory = HDDMemory;
        this.processor = processor;
    }

    public void printLaptopData() {
        System.out.println("Laptop Name: " + name);
        System.out.println("HDD Memory: " + HDDMemory + " GB");
        System.out.println("CPU Data: " + processor.getCPUData());
    }

    public void execute() {
        if (processor.RAM > 4096 && processor.frequency > 2.5) {
            System.out.println("Laptop is started and executing");
        } else {
            System.out.println("Cannot start computer");
        }
    }
}
