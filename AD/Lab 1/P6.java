import java.util.*;
public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        if(n==1 || n==2)
           System.out.println("The nth fibonaci number is: "+(n-1));
        int a=0,b=1,c=b;
        n=n-2;
        while(n>0){
            c=a+b;
            a=b;
            b=c;
            n=n-1;
        }
        System.out.println("The nth Fibonacci is: "+c);
    }
}