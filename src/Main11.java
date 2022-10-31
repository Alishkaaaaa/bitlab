import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number1=in.nextInt();
        int number2=in.nextInt();
        int number3=in.nextInt();
        int sum1=number1+number2;
        int sum2=number3-number1;
        int sum3=number1+number2+number3;
        System.out.println("a="+sum1);
        System.out.println("b="+sum2);
        System.out.println("c="+sum3);


    }
}
