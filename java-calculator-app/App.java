public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Calculator Service Started...");
        int a = 10, b = 5;
        while (true) {
            System.out.println("Calculating: " + a + " + " + b + " = " + (a + b));
            Thread.sleep(10000);
        }
    }
}
