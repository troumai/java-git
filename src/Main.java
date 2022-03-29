
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Tomiris");
        printHelloWorldFromYerzhan();
        System.out.println(sumNum(5, 10));
        System.out.println(multiple(2, 2));
        System.out.println(subtract(4, 1));

    }

    public static void printHelloWorldFromYerzhan(){
        System.out.println("Hello world from Yerzhan");
    }
    public static int sumNum(int a, int b){
        return a+b;
    }
    public static int multiple(int a, int b){
        return a*b;
    }

    void bubbleSort(int arr[])
    {
        // with love from Yerzhan <3
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    public static int subtract(int a, int b){
        return a-b;
    }

    public static void someText(){
        System.out.println("For merge conflict solve problem");
    }

}
