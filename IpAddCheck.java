import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class MyRegex {
    String strg;
    MyRegex(String strg) {
        this.strg = strg; 
    }

    boolean checkIp() {
        String zero_to_255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        String regex = "^" + zero_to_255 + "\\."
                + zero_to_255 + "\\."
                + zero_to_255 + "\\."
                + zero_to_255 + "$";
        Pattern pat = Pattern.compile(regex);

        if(this.strg == null) {
            return false;
        }

        Matcher m = pat.matcher(this.strg);

        // System.out.println("search item: "+this.strg);
        return m.matches();
    }   
}

public class IpAddCheck {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter IP: ");
        while(sc.hasNext()){
            String ipAdd = sc.nextLine();
            MyRegex re = new MyRegex(ipAdd);
            System.out.println("Checked Status: "+re.checkIp());
            System.out.println("Enter IP: ");
        }
        sc.close();
    }
}
