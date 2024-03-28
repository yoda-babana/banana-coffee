import java.util.*;


public class Main {
    public static void main(String[] args) {
//        cw_1();
  hw1();
    }

    private static final ArrayList<User> users = new ArrayList<>();

    public static void cw_1() {

        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("\nPRESS [1] ADD USER");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [0] TO EXIT");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    addUser(scanner);
                    break;
                case "2":
                    listUsers();
                    break;
                case "0":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        } while (!input.equals("0"));
    }

    private static void addUser(Scanner scanner) {
        System.out.println("PRESS [1] TO ADD STUDENT");
        System.out.println("PRESS [2] TO ADD STAFF");
        String type = scanner.nextLine();

        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter login: ");
        String login = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter surname: ");
        String surname = scanner.nextLine();

        if ("1".equals(type)) {
            System.out.print("Enter GPA: ");
            double gpa = scanner.nextDouble();
            Student student = new Student(id, login, password, name, surname, gpa);

            users.add(student);
        } else if ("2".equals(type)) {
            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();
            Staff staff = new Staff(id, login, password, name, surname, salary);

            users.add(staff);
        } else {
            System.out.println("Invalid user type.");
        }
    }

    private static void listUsers() {
        System.out.println("\nListing Users:");
        for (User user : users) {
            System.out.println(user.getData());
            if (user instanceof Student) {
                System.out.println("Type: Student");
            } else if (user instanceof Staff) {
                System.out.println("Type: Staff");
            } else {
                System.out.println("Type: User");
            }
        }
    }


//hw lab 4

    public static void hw1() {
        Library library = new Library("Central Library", "New York", "USA");

        library.addBook(new ScientificBook("ScientificBook1", "SC001", 300, 50, "Science Publications"));
        library.addBook(new ScientificBook("ScientificBook2", "SC002", 250, 45, "Research Press"));
        library.addBook(new ScientificBook("ScientificBook3", "SC003", 400, 60, "Tech Books Inc."));

        library.addBook(new LiteratureBook("LiteratureBook1", "LT001", 200, "Author A", 2000));
        library.addBook(new LiteratureBook("LiteratureBook2", "LT002", 180, "Author B", 1998));
        library.addBook(new LiteratureBook("LiteratureBook3", "LT003", 220, "Author C", 2005));

        library.printLibraryData();
      //call our home work task with the menu 
        hw2(library);
    }

    public static void hw2(Library library){

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nPRESS [1] TO SEARCH BOOK BY NAME");
            System.out.println("PRESS [2] TO SEARCH BOOK BY CODE");
            System.out.println("PRESS [3] TO SEARCH BOOK BY PAGES AMOUNT");
            System.out.println("PRESS [0] TO EXIT");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("INSERT NAME OF THE BOOK:");
                    String name = scanner.next();
                    searchBookByName(library, name);
                    break;
                case 2:
                    System.out.println("INSERT CODE OF THE BOOK:");
                    String code = scanner.next();
                    searchBookByCode(library, code);
                    break;
                case 3:
                    System.out.println("INSERT MINIMUM AMOUNT OF PAGES:");
                    int minPages = scanner.nextInt();
                    System.out.println("INSERT MAXIMUM AMOUNT OF PAGES:");
                    int maxPages = scanner.nextInt();
                    searchBookByPages(library, minPages, maxPages);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void searchBookByName(Library library, String name) {
        System.out.println("Books with name '" + name + "':");
        for (int i = 0; i < library.getSizeOfBooks(); i++) {
            if (library.getBooks()[i].name.equalsIgnoreCase(name)) {
                System.out.println(library.getBooks()[i].getBookData());
            }
        }
    }

    private static void searchBookByCode(Library library, String code) {
        System.out.println("Books with code '" + code + "':");
        for (int i = 0; i < library.getSizeOfBooks(); i++) {
            if (library.getBooks()[i].code.equalsIgnoreCase(code)) {
                System.out.println(library.getBooks()[i].getBookData());
            }
        }
    }

    private static void searchBookByPages(Library library, int minPages, int maxPages) {
        System.out.println("Books with pages between " + minPages + " and " + maxPages + ":");
        for (int i = 0; i < library.getSizeOfBooks(); i++) {
            if (library.getBooks()[i].pages >= minPages && library.getBooks()[i].pages <= maxPages) {
                System.out.println(library.getBooks()[i].getBookData());
            }
        }
    }
}
