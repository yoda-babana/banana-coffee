public class Car {

    String name;
    String model;
    int maxSpeed;
    double engineVolume;


    public Car() {
        this.name = "";
        this.model = "";
        this.maxSpeed = 0;
        this.engineVolume = 0.0;
    }

    public Car(String name, String model, int maxSpeed, double engineVolume) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.engineVolume = engineVolume;
    }

    public String toString() {
        return "Car:" + " " + this.name + " " + this.model + ", " + this.maxSpeed + "km/h, " + this.engineVolume + " liters";
    }
    void ride(){
    if (this.engineVolume > 2.2){
        System.out.println("Car is riding");
        return;
    }
        System.out.println("Couldn’t start engine");
    }

}

//public class Student {
//    private String name;// default
//    private int age;
//    private double mark;
//
//
//    public Student(String name, int age, double mark){
//        this.name = name;
//        this.age = age;
//        this.mark = mark;
//    }
//
//    public Student() {
//    }
//
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    ////////////////////////////
//    public int getAge(){
//        return age;
//    }
//
//    public void setAge(int age){
//        if(age >=0 && age <= 100){
//            this.age = age;
//        }
//        else System.out.println("The age of " + name + " must be between 0 and 100");
//
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getMark() {
//        return mark;
//    }
//
//    public void setMark(double mark) {
//        this.mark = mark;
//    }
//    ///////////////////////////
//
//    public String toString(){
//        return name + " "+age + " "+mark;
//    }
//
//}
//public class Student {
//    private String name;// default
//    private int age;
//    private double mark;
//
//
//    public Student(String name, int age, double mark){
//        this.name = name;
//        this.age = age;
//        this.mark = mark;
//    }
//
//    public Student() {
//    }
//
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    ////////////////////////////
//    public int getAge(){
//        return age;
//    }
//
//    public void setAge(int age){
//        if(age >=0 && age <= 100){
//            this.age = age;
//        }
//        else System.out.println("The age of " + name + " must be between 0 and 100");
//
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getMark() {
//        return mark;
//    }
//
//    public void setMark(double mark) {
//        this.mark = mark;
//    }
//    ///////////////////////////
//
//    public String toString(){
//        return name + " "+age + " "+mark;
//    }
//
//}