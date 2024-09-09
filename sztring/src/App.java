public class App {
    public static void main(String[] args) throws Exception {
        String szoveg = "Még nyílnak a völgyben";
        // System.out.println(szoveg.length());
        szoveg = szoveg.replaceAll("n", "r");   // így lehet csak cserélni, a szoveg alapból nem változtatható
        System.out.println(szoveg);
        szoveg = szoveg + " a kerti virágok";
        System.out.println(szoveg);




        String nevek = "Lili Teri Piri";
        String[] tomb = nevek.split(" ");  //mindig a szeparátort adjuk meg
        System.out.println(tomb[2]);

        //Összehasonlítás, így kell!!

        String a = "alma";
        String b = "szilva";
        if(b.equals(a)){
            System.out.println("igen, alma");
        }
        else {
            System.out.println("Más");
        }


        StringBuilder sb = new StringBuilder();
        sb.append("körte");
        String str = sb.toString();  //Sztringgé alakítás
        System.out.println(str);
        

        int kor = 35;

        String c = """  
                alma

                körte %d
                szilva
                """.formatted(kor);  // sorkihagyást is kiírja
        System.out.println(c);




    }
}
