import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int m = in.nextInt();
        System.out.println(max(n,k,m));
    }

    public static int max(int n, int k, int m) {
        if (n > k && n > m) {
            return n;
        } else if (k > n && k > m) {
            return k;
        } else {
            return m;
        }
    }
}