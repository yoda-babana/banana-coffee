import java.nio.file.NoSuchFileException;
import java.util.*;
import java.text.DecimalFormat;

public class lab2 {
    public static void printIntegers(int[] arr) {
        System.out.println();
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

    }
    private static void homeWork_1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of elements for Task 1:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int summa = 0;
        int start_ind = -1;
        int end_ind = -1;
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (array[i] == 0 && start_ind == -1) {
                start_ind = array[i];

            } else if (array[i] == 0 && start_ind != -1 && end_ind == -1) {
                end_ind = array[i];
            }
        }
        for (int i = start_ind; i < end_ind; i++) {
            summa += array[i];
        }
        System.out.println(summa);
    }

    private static void homeWork_2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter num:");
        int n2 = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == n2) {
                index = i;
                System.out.println("Yes");
                System.out.println("Index: " + index);
                return;
            }

        }
        System.out.println("No");


    }

    private static void homeWork_3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = scanner.nextInt();
        int first_max_num = -500;
        int second_max_num = -500;
        int[] array = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > first_max_num) {
                first_max_num = array[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (array[i] < first_max_num && array[i] > second_max_num) {
                second_max_num = array[i];
            }
        }
        System.out.println(second_max_num);
    }

    private static void homeWork_4() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] times = new int[N][3];

        for (int i = 0; i < N; i++) {
            times[i][0] = scanner.nextInt(); // Hours
            times[i][1] = scanner.nextInt(); // Minutes
            times[i][2] = scanner.nextInt(); // Seconds
        }

        Arrays.sort(times, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            if (a[1] != b[1]) return a[1] - b[1];
            return a[2] - b[2];
        });

        for (int[] time : times) {
            System.out.println(time[0] + " " + time[1] + " " + time[2]);
        }

    }


    private static void oneDimensionalArray_1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (array[i] > 0) {
                System.out.println(array[i]);
            }
        }

    }

    private static void oneDimensionalArray_2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int max_num = -500;
        int min_num = 500;
        int min_index = 0;
        int max_index = 0;
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (max_num < array[i]) {
                max_num = array[i];
                max_index = i;
            }
            if (min_num > array[i]) {
                min_num = array[i];
                min_index = i;
            }
        }
        System.out.println("Max: " + max_num + " Index: " + max_index);
        System.out.println("Min: " + min_num + " Index: " + min_index);
    }

    private static void oneDimensionalArray_3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " integers:");
        int max_num = -500;
        int min_num = 500;
        int min_index = 0;
        int max_index = 0;
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (max_num < array[i]) {
                max_num = array[i];
                max_index = i;
            }
            if (min_num > array[i]) {
                min_num = array[i];
                min_index = i;
            }
        }
        array[min_index] = max_num;
        array[max_index] = min_num;
        printIntegers(array);
    }

    private static void oneDimensionalArray_4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int[] positive_array = new int[n];
        int[] negative_array = new int[n];
        int zero_count = 0;
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > 0) {
                positive_array[i] = array[i];
            } else if (array[i] < 0) {
                negative_array[i] = array[i];
            } else {
                zero_count += 1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (positive_array[i] != 0) {
                System.out.print(positive_array[i] + " ");
            }
        }
        for (int i = 0; i < zero_count; i++) {
            System.out.print(0 + " ");

        }
        for (int i = 0; i < n; i++) {
            if (negative_array[i] != 0) {
                System.out.print(negative_array[i] + " ");
            }
        }
    }

    private static void oneDimensionalArray_5() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int product = 1;
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (array[i] != 0) {
                product *= array[i];
            }
        }
        System.out.println(product);
    }

    private static void oneDimensionalArray_6() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = scanner.nextInt();
        double[] array = new double[n];
        double product = 1;
        int nonzero_count = 0;
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (array[i] != 0) {
                nonzero_count += 1;
                product *= array[i];

            }


        }
        System.out.println(Math.pow(product, 1 / nonzero_count));

    }

    private static void oneDimensionalArray_7() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter num:");
        int num = scanner.nextInt();
        int gt_amount = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > num) {
                gt_amount += 1;
            }
        }
        System.out.println(gt_amount);
    }

    private static void ArrayList() {
        // 1) Convert an array to an ArrayList
        String[] array = {"Apple", "Banana", "Cherry"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("ArrayList from Array: " + arrayList);

        // 2) Convert an ArrayList to an array
        String[] arrayFromList = new String[arrayList.size()];
        arrayFromList = arrayList.toArray(arrayFromList);
        System.out.println("Array from ArrayList: " + Arrays.toString(arrayFromList));

        // 3) Search for an element in an ArrayList
        String searchElement = "Banana";
        int index = arrayList.indexOf(searchElement);
        System.out.println("Index of '" + searchElement + "': " + index);

        // 4) Swap two elements in an ArrayList
        Collections.swap(arrayList, 0, 2); // Swapping first and last elements
        System.out.println("ArrayList after swap: " + arrayList);
    }



    public static void main(String[] args) {
        ArrayList();
    }



}
