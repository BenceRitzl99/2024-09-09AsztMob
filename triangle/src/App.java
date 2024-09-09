public class App {

    public static double calcArea(double base, double height) {
        return base * height / 2;

    }
    private static void about() {
        System.out.println("Nagy János");
        System.out.println("Budapest");
    }

    public static void main(String[] args) throws Exception {
        double area = calcArea(30, 35);
        System.out.println("Terület: " + area);
        System.out.printf("Terület: %.2f\n", area);
        about();
    }

    
}
