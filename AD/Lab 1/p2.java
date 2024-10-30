import java.util.Scanner;

class p2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter "+n+" numbers: ");
        for(int i=0;i<n;i++)
           arr[i]=sc.nextInt();
        int max,min;
        max=min=arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i])
               max=arr[i];
            if(min>arr[i])
               min=arr[i];
        }
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min); 
    }
}