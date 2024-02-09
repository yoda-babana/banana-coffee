// all tasks except 7th

import java.util.*;
import java.util.random.RandomGenerator;


public class Main {
    public static void main(String[] args) {
        hw_task2();
    }

    public static void cw_task1() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Car car[] = new Car[n];

        for (int i = 0; i < n; i++) {
            car[i] = new Car();

            car[i].name = scanner.nextLine();
            car[i].model = scanner.nextLine();
            car[i].maxSpeed = scanner.nextInt();
            car[i].engineVolume = scanner.nextDouble();
        }
        for (int i = 0; i < 0; i++) {
            car[i].ride();
        }
    }

    public static void cw_task2() {
        int n = 10;
        Car car[] = new Car[n];
        for (int i = 0; i < n; i++) {
            car[i] = new Car();
            car[i].name = "Car" + i + 1;
            car[i].model = "Model Tesla X";
            car[i].maxSpeed = new Random().nextInt(1000);
            car[i].engineVolume = new Random().nextDouble(35);
        }
    }

    public static void cw_task3() {
        Club club = new Club();
        Player[] players = {
                new Player("Neuer", "GK", 1, false),
                new Player("Carvajal", "RB", 2, false),
                new Player("Ramos", "CDF", 4, false),
                new Player("Kante", "CB", 6, false),
                new Player("Griezmann", "FWD", 7, false)
        };

        club.name = "Example Club";
        club.players = players;
        club.printClubData();

        System.out.println("\n");

        club.printSquad();

    }

    public static void bubbleSort(Student[] students) {
        int n = students.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (students[i - 1].gpa < students[i].gpa) {
                    Student temp = students[i - 1];
                    students[i - 1] = students[i];
                    students[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void BubbleSort(Oscar[] nominees) {
        int n = nominees.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (nominees[i - 1].getRating() < nominees[i].getRating()) {
                    Oscar temp = nominees[i - 1];
                    nominees[i - 1] = nominees[i];
                    nominees[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void hw_task1() {
        Student[] students = new Student[5];
        students[0] = new Student(1, "A", "B", 4.0);
        students[1] = new Student(2, "A", "V", 4.0);
        students[2] = new Student(3, "A", "B", 4.0);
        students[3] = new Student(4, "A", "V", 4.0);
        students[4] = new Student(5, "A", "B", 4.0);

        for (Student student : students) {
            System.out.println(student.getData());
        }

    }

    public static void hw_task2() {
        int n = 10;
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            students[i].id = i + 1;
            students[i].name = "Student #" + (i + 1);
            students[i].surname = "StudentSurname #" + (i + 1);
            students[i].gpa = new Random().nextDouble(4);
        }
        bubbleSort(students);


        for (Student student : students) {
            System.out.println(student.getData());
        }

    }

    public static void hw_task3() {
        Laptop laptop = new Laptop();
        laptop.name = "XXX";
        laptop.HDDMemory = 5;
        laptop.processor = new CPU();
        laptop.processor.frequency = 5;
        laptop.processor.RAM = 64;
        laptop.processor.name = "Pentium";

        laptop.printLaptopData();
        laptop.execute();
    }

    public static void hw_task4() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String laptopInfo = scanner.nextLine();
            String[] laptopData = laptopInfo.split(" ");
            String name = laptopData[0];
            int price = Integer.parseInt(laptopData[1]);
            int generation_of_CPU = Integer.parseInt(laptopData[2]);
            String ssd = laptopData[3];

            Laptop_task4 laptop = new Laptop_task4(name, price, generation_of_CPU, ssd);
            laptop.calculateNewPrice();
        }
    }

    public static void hw_task5() {
        Scanner scanner = new Scanner(System.in);
        int numberOfGroups = scanner.nextInt();

        for (int i = 0; i < numberOfGroups; i++) {
            String groupInfo = scanner.nextLine();
            String[] groupData = groupInfo.split(" ");
            String groupName = groupData[0];
            int countOfTourists = Integer.parseInt(groupData[1]);

            Group group = new Group(groupName, countOfTourists);

            for (int j = 0; j < countOfTourists; j++) {
                String touristInfo = scanner.nextLine();
                String[] touristData = touristInfo.split(" ");
                String touristName = touristData[0];
                int money = Integer.parseInt(touristData[1]);
                String access = touristData[2];

                Tourist tourist = new Tourist(touristName, money, access);
                group.addTourist(tourist, j);
            }

            if (group.canGoToExpedition()) {
                System.out.println(groupName + " - YES");
            } else {
                System.out.println(groupName + " - NO");
            }
        }
    }

    public static void hw_task6() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        Oscar[] nominees = new Oscar[n];

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            String surname = input[1];
            int movies = Integer.parseInt(input[2]);
            double rating = Double.parseDouble(input[3]);

            nominees[i] = new Oscar(name, surname, movies, rating);
        }

        BubbleSort(nominees);

        for (int i = n - 1; i > 0; i--) {
            Oscar nominee = nominees[i];
            System.out.println(nominee.getFullName() + " " + nominee.getMovies() + " " + nominee.getRating());
        }
    }

  // It should work? but was not written by me
//    public static void hw_task7() {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            String cityName = scanner.nextLine();
//            int countOfPharmacies = scanner.nextInt();
//
//            Pharmacy[] pharmacies = new Pharmacy[countOfPharmacies];
//            for (int j = 0; j < countOfPharmacies; j++) {
//                String pharmacyName = scanner.nextLine();
//                int countOfDrugs = scanner.nextInt();
//
//                Drug[] drugs = new Drug[countOfDrugs];
//                for (int k = 0; k < countOfDrugs; k++) {
//                    String[] drugInfo = scanner.nextLine().split(" ");
//                    String drugName = drugInfo[0];
//                    int drugPrice = Integer.parseInt(drugInfo[1]);
//                    String outOfDate = drugInfo[2];
//
//                    drugs[k] = new Drug(drugName, drugPrice, outOfDate);
//                }
//
//                pharmacies[j] = new Pharmacy(pharmacyName, countOfDrugs, drugs);
//            }
//
//            City city = new City(cityName, countOfPharmacies, pharmacies);
//            Drug mostExpensiveInCity = city.getMostExpensiveDrugInCity();
//
//            System.out.println("City: " + city.getName());
//            for (int k = 0; k < n; k++) {
//                Pharmacy pharmacy = pharmacies[k];
//                Drug mostExpensiveInPharmacy = pharmacy.getMostExpensiveDrug();
//                System.out.println("The most expensive drug in " + pharmacy.getName() + " is " + mostExpensiveInPharmacy.getName());
//            }
//            System.out.println("THE MOST EXPENSIVE DRUG IN " + city.getName() + ": " + mostExpensiveInCity.getName());
//        }
//    }

}
