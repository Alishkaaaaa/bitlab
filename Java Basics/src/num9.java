import java.util.Scanner;

public class num9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        System.out.println(triangle(n,m,k));
    }

    public static String triangle(int n, int m, int k) {
        if (n + m > k && m + k > n && n + k > m) {
            return "YES";
        }else{
            return "NO";
        }
        }
    }

