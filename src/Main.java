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

    public static int subtract(int a, int b){
        return a-b;
    }

}
