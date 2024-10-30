import java.util.Arrays;

public class p2_allDuplicateElements {
    public static int binarySearch(int[]arr,int key,int low,int high,int mid){
        if(low>high)
          return -1;
        if(arr[mid]==key)
           return mid;
       if(arr[mid]<key)
          return binarySearch(arr, key, mid+1, high, (low+high)/2);
       else
       return binarySearch(arr, key, low, mid-1, (low+high)/2);
   }
    public static void main(String[] args) {
        int[]arr = {1,2,3,3,4,2,1};
        Arrays.sort(arr);
        int low=1,high=arr.length-1,mid=(low+high)/2;
        for(int i=0;i<arr.length;i++){
            int searchResult = binarySearch()
        }
    }
}
