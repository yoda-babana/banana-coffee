// all tasks except 7th
import java.util.*;
import java.util.random.RandomGenerator;


public class main {
    public static void main(String[] args) {
        class_task3();









//        Drug adderall = new Drug("Adderall", 2000, "YES");
//        Drug clonazepam = new Drug("Clonazepam", 3200, "NO");
//        Drug lexapro = new Drug("Lexapro", 950, "YES");
//        Drug xanax = new Drug("Xanax", 5600, "NO");
//        Drug pantoprazole = new Drug("Pantoprazole", 1800, "YES");
//        Drug gabapentin = new Drug("Gabapentin", 7400, "NO");
//        Drug cymbalta = new Drug("Cymbalta", 1600, "YES");
//        Drug tramadol = new Drug("Tramadol", 450, "YES");
//        Drug azithromycin = new Drug("Azithromycin", 780, "NO");
//        Drug ritalin = new Drug("Ritalin", 1200, "YES");
//        Drug methadone = new Drug("Methadone", 9800, "YES");
//
//        // Создание аптек
//        Pharmacy kzPharma = new Pharmacy("KZPharma", 3, new Drug[]{adderall, clonazepam, lexapro});
//        Pharmacy evalar = new Pharmacy("Evalar", 2, new Drug[]{xanax, pantoprazole});
//        Pharmacy euroPharma = new Pharmacy("EuroPharma", 4, new Drug[]{gabapentin, cymbalta, tramadol, azithromycin});
//        Pharmacy health = new Pharmacy("Health", 2, new Drug[]{ritalin, methadone});
//
//        // Создание городов
//        City almaty = new City("ALMATY", 2, new Pharmacy[]{kzPharma, evalar});
//        City astana = new City("ASTANA", 2, new Pharmacy[]{euroPharma, health});
//
//        // Печать самого дорогого лекарства в каждой аптеке и городе
//        homeWork_task7(new City[]{almaty, astana});

    }














    public static void class_task1() {
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

    public static void class_task2() {
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

    public static void class_task3() {
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

    public static void homeWork_task1() {
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

    public static void homeWork_task2() {
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

    public static void homeWork_task3() {
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

    public static void homeWork_task4() {
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

    public static void homeWork_task5() {
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

    public static void homeWork_task6() {
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


//    public static void homeWork_task7(City[] cities) {
//        for (City_homeWork7 city : cities) {
//            System.out.println("City: " + city.name);
//            Drug mostExpensiveDrugInCity = null;
//            for (Pharmacy_homeWork7 pharmacy : city.pharmacies) {
//                Drug mostExpensiveDrugInPharmacy = null;
//                for (Drug drug : pharmacy.drugs) {
//                    if (mostExpensiveDrugInPharmacy == null || drug.price > mostExpensiveDrugInPharmacy.price) {
//                        mostExpensiveDrugInPharmacy = drug;
//                    }
//                    if (mostExpensiveDrugInCity == null || drug.price > mostExpensiveDrugInCity.price) {
//                        mostExpensiveDrugInCity = drug;
//                    }
//                }
//                System.out.println("The most expensive drug in " + pharmacy.name + " is " + mostExpensiveDrugInPharmacy.name);
//            }
//            System.out.println("THE MOST EXPENSIVE DRUG IN " + city.name + ": " + mostExpensiveDrugInCity.name);
//        }
//    }
}


