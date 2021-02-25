// code by @ironsubhajit

import java.lang.Math;
import java.util.Scanner;

public class java_loops_2 {
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        int a, b, n;

        for (int tc = 0; tc < q; tc++) {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            print_series(a, b, n);
        }
        sc.close();
    }

    public static void print_series(int a, int b, int n) {
        for (int i = 0; i < n; i++) {
            a += ((Math.pow(2, i))*b);
            System.out.print(a+" ");
        }
        System.out.println();
    }
}
