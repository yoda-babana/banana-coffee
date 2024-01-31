import java.nio.file.NoSuchFileException;
import java.util.*;
import java.text.DecimalFormat;

public class lab1 {

    public static void easyTask1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter four numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        int max = findMax(num1, num2, num3, num4);

        System.out.println("The maximum number is: " + max);
    }

    public static int findMax(int a, int b, int c, int d) {
        int max1 = Math.max(a, b);
        int max2 = Math.max(c, d);
        return Math.max(max1, max2);
    }

    public static void easyTask2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 digit number");
        int number = scanner.nextInt();
        int number2 = number / 100;
        int number3 = (number % 100) / 10;
        int number4 = number % 10;
        int result = number3 * 100 + number2 * 10 + number4;
        System.out.println(result);
        System.out.println(number3);
        System.out.println(number2);
        System.out.println(number4);
    }

    public static void easyTask3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x");
        int x = scanner.nextInt();
        System.out.println("Enter y");
        int y = scanner.nextInt();
        if (x >= 0 && y >= 0) {
            System.out.println("quarter 1");
        } else if (x <= 0 && y >= 0) {
            System.out.println("quarter 2");
        } else if (x <= 0 && y <= 0) {
            System.out.println("quarter 3");
        } else if (x >= 0 && y <= 0) {
            System.out.println("quarter 4");
        } else if (x == 0 && y == 0) {
            System.out.println("Error");
        }
    }

    public static void easyTask4() {
        Scanner scanner = new Scanner(System.in);
        int number1, number2, number3;
        int positive = 0, negative = 0, zero = 0;
        System.out.println("Enter number1");
        number1 = scanner.nextInt();
        System.out.println("Enter number2");
        number2 = scanner.nextInt();
        System.out.println("Enter number3");
        number3 = scanner.nextInt();

        if (number1 > 0) {
            positive++;
        } else if (number1 == 0) {
            zero++;
        } else if (number1 < 0) {
            negative++;
        }

        if (number2 > 0) {
            positive++;
        } else if (number2 == 0) {
            zero++;
        } else if (number2 < 0) {
            negative++;
        }


        if (number3 > 0) {
            positive++;
        } else if (number3 == 0) {
            zero++;
        } else if (number3 < 0) {
            negative++;
        }
        System.out.println("positive " + positive);
        System.out.println("negative " + negative);
        System.out.println("zero " + zero);
    }

    public static void easyTask5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
        int number = scanner.nextInt();
        int number1, number2, number3;
        number1 = number / 100;
        number2 = (number % 100) / 10;
        number3 = number % 10;

        var numberToString = Integer.toString(number);


        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        int result = Math.max(Math.max(number1, number2), number3);
        System.out.println("max number is ");
        System.out.println(result);
    }

    //Easy homework
    public static int easyTask6(int number) {
        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;


        return digit1 * 100 + digit3 * 10 + digit2;
    }

    public static double easyTask7(double purchaseAmount) {
        double discount = 0.0;

        if (purchaseAmount > 10000) {
            discount = 0.1;
        } else if (purchaseAmount > 5000) {
            discount = 0.05;
        }

        return purchaseAmount - (purchaseAmount * discount);
    }

    public static String easyTask8(int number) {
        int digitSum = 0;
        int tempNumber = number;

        // Calculate sum of digits
        while (tempNumber > 0) {
            digitSum += tempNumber % 10;
            tempNumber /= 10;
        }

        return (digitSum >= 10) ? "Yes" : "No";
    }


    public static String easyTask9(int number) {
        int digitMultiplication = 1;
        int tempNumber = number;

        // Calculate product of digits
        while (tempNumber > 0) {
            digitMultiplication *= tempNumber % 10;
            tempNumber /= 10;
        }

        return (digitMultiplication >= 100) ? "Yes" : "No";
    }

    public static String easyTask10(int number) {
        int tempNumber = number;

        // Check if any digit is equal to 9
        while (tempNumber > 0) {
            if (tempNumber % 10 == 9) {
                return "Yes";
            }
            tempNumber /= 10;
        }

        return "No";
    }


    public static void test() {
        var number = 343;
        // перевод числа в строку
        var numberAsString = Integer.toString(number);
        // вычесление длины строки
        int numberOfDigits = numberAsString.length();
        System.out.println(numberOfDigits);
        // Разделение строки на массив символов (цифр)
        String[] check = numberAsString.split("");
        // длина массива символов (цифр)
        var check2 = check.length;
        System.out.println(check2);
    }

    public static void test2() {
        var number = 123;
        var sum = 0;
        var test = 0;
        // число в строку
        String stringNumber = Integer.toString(number);

        for (char digitChar : stringNumber.toCharArray()) {
            // Преобразование символа цифры обратно в число
            var digit = Character.getNumericValue(digitChar);
            sum += digit;
        }

        System.out.println(sum);
    }


    // Medium classwork
    public static void mediumTask1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        var n = scanner.nextInt();

        for (var i = 1; i <= n; i++) {
            for (var j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void mediumTask2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n:");
        var n = scanner.nextInt();

        for (var i = 1; i <= n; i++) {
            for (var j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void mediumTask3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n:");
        var n = scanner.nextInt();

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += (float) i / (2 * i - 1);
            System.out.println(sum);
        }
    }

    public static void mediumTask4(int input) {
        double sum = input / 5.0;
        System.out.println("Sum for input " + input + ": " + sum);

    }

    public static void mediumTask5(int[] numbers) {
        int sum = 0;
        int count = 0;

        for (int number : numbers) {
            if (number == 0) {
                break;
            }
            sum += number;
            count++;
        }

        double average = count > 0 ? (double) sum / count : 0;
        System.out.println("Count: " + count + ", Average: " + average);
    }

    public static void mediumTask6(int pricePerKg) {
        for (double i = 0.1; i <= 1.0; i += 0.1) {
            int price = (int) (i * pricePerKg);
            System.out.printf("%.1f kg is %d tg\n", i, price);
        }
    }

    public static void mediumTask7(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        System.out.println("Sum for input " + n + ": " + sum);

    }

    public static void mediumTask8(int n) {
        int totalSum = 0;
        for (int i = 1; i <= n; i++) {
            totalSum += i * (i + 1) / 2;
        }
        System.out.println("Sum for input " + n + ": " + totalSum);

    }

    public static void mediumTask9(int n) {
        int sum = 0;
        int term = 0;
        for (int i = 1; i <= n; i++) {
            term = term * 10 + 8;  // Appending 8 at the end of the term
            sum += term;
        }
        System.out.println("Sum for input " + n + ": " + sum);

    }

    public static void mediumTask10(int n) {
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }


    // HARD LEVEL

    public static void hardTask1(int n, int m) {
        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void hardTask2(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void hardTask3(int decimal) {
        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }

        System.out.println("Binary representation: " + binary);
    }

    public static void hardTask4() {

    }

    public static void hardTask5() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int original = n;
        int reversed = 0;

        while (n > 0) {
            int remainder = n % 10;
            reversed = reversed * 10 + remainder;
            n /= 10;
        }

        if (original == reversed) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static void hardtask6() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int original = n;
        int reversed = 0;

        while (n > 0) {
            int remainder = n % 10;
            reversed = reversed * 10 + remainder;
            n /= 10;
        }

        System.out.println(reversed);
    }

    public static void hardTask7() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String s = Integer.toString(n);

        int first = Character.getNumericValue(s.charAt(0));
        int last = Character.getNumericValue(s.charAt(s.length() - 1));

        System.out.println(first + last + "(" + first + "+" + last + ")");

    }



    public static void hardTask9() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            if (is_prime(i)) {
                System.out.print(i + " ");
            }
        }
    }


    public static boolean is_prime(int num) {
        if (num <= 1) {
            return false;
        }

        int div_count = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                div_count++;
            }
        }

        return div_count < 2;
    }


    public static void main(String[] args) {
//        hardTask1(10, 15);
//        hardTask2(3);
//        hardTask3(3);
        System.out.println("hellow world!");




//                    mediumTask3();
//                    mediumTask4(3);
//                    mediumTask4(42);

//                    int[] input = {3, 8, 9, 0};
//                    mediumTask5(input);

//                    mediumTask6(1000);
//                    mediumTask7(5);
//                    mediumTask8(5);
//                    mediumTask8(3);
//                    mediumTask9(15);
//                    mediumTask10(4);


    }
}



















