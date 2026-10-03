public class Task3 {
    public static void main(String[] args) {
        String a = new String("Wow");
        String b = "Wow";
        String c = b;
        String d = "Wow!";          

        boolean b1 = a.equals(b);   
        boolean b2 = d.equals(b + "!"); 
        boolean b3 = !c.equals("Different"); 

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}
