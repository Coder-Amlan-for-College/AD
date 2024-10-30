import java.util.Scanner;

public class p4 {
    public static int[] reverseArray(int[]arr){
        
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[]arr = new int[size];
        String s = "";
        System.out.println("Enter the numbers: ");
        for(int i=0;i<size;i++){
          arr[i]=sc.nextInt();
          s=s+arr[i]+",";
        }
        int revArr = reverseArray(arr);
        //System.out.println(s);
    }
}
