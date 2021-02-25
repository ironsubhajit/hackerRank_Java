import java.util.*;

public class Java_int_to_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Integer: ");
        int n = sc.nextInt();
//        prints type of primitive datatype
        System.out.println(n+" is typeof: "+((Object)n).getClass());
//        converts to string
        System.out.println("Converting to string...");
        String s = Integer.toString(n);
//        prints type of s
        System.out.println(s+" is typeof: "+s.getClass());
    }
}
