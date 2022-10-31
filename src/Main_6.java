import java.util.Scanner;

public class Main_6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int num3=in.nextInt();
        int sum=num1+num2+num3;
        int difference=num1-num2-num3;
        int multiply=num1*num2*num3;
        //System.out.println("a+b+c="+ (num1+num2+num3));

        System.out.println("a+b+c="+sum);
        System.out.println("a-b-c="+difference);
        System.out.println("a*b*c="+ multiply);
    }
}
