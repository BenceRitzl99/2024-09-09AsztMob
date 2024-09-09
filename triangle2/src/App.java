public class App {
    public static void main(String[] args) throws Exception {

        // Triangle tri = new Triangle();
        // double area = tri.calcArea(30,35);
        double area = Triangle.calcArea(30, 35);
        
        System.out.printf("%.2f\n", area);
    }
}
