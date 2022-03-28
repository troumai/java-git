
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Tomiris");
        printHelloWorldFromYerzhan();
        System.out.println(sumNum(5, 10));
        System.out.println(multiple(2, 2));
        System.out.println(subtract(4, 1));

        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Sorted array");
        printArray(arr);
    }

    public static void printHelloWorldFromYerzhan() {
        System.out.println("Hello world from Yerzhan");
    }

    public static int sumNum(int a, int b) {
        return a + b;
    }

    public static int multiple(int a, int b) {
        return a * b;
    }

    static void bubbleSort(int arr[]) {
        // with love from Yerzhan <3
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    /* Prints the array */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
