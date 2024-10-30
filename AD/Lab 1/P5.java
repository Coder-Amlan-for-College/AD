import java.util.Scanner;

public class P5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        long n = sc.nextInt();
        long factorial=1;
        for(int i=1;i<=n;i++)
          factorial=factorial*i;
        System.out.println("Factorial of "+n+" is "+factorial);
    }
}
