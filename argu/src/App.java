public class App {
    public static void main(String[] args) throws Exception {
        if(args.length == 0) {
            System.out.println("Hiba! Nem adtál meg argumentumot!");
            System.exit(1);
        }
        System.out.println("Az argumentum: " + args[0]);
    }
}
