import java.util.*;

public class P7 {
    public static void main(String[]args){
          Scanner sc = new Scanner(System.in);
          //System.out.print("Enter array size: ");
          int[]arr = {1,3,5,4,2};
          Arrays.sort(arr);
          int[]new_arr = new int[arr.length];
          int pos = 0,frontIndex=0,lastIndex=arr.length-1;
          while(frontIndex<=lastIndex){
            if(pos%2==0){
                new_arr[pos]=arr[lastIndex];
                lastIndex--;
            }
            else{
                new_arr[pos]=arr[frontIndex];
                frontIndex++;
            }
            pos++;
          }
          for(int i=0;i<arr.length;i++)
             System.out.println(new_arr[i]);
    }
}
