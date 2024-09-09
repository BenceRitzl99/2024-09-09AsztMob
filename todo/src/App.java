public class App {
    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            System.out.println(args[0]);

        }
        else {
            System.out.println("Nem adtál meg paramétert!");
            System.exit(1);
        }

        

        


        Writer writer = new Writer();
        writer.writeTodo(args[0]);
        
        
    }
}
