public class P4_BinarySearch_Recursive {
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
        int[]arr ={1,2,3,4,5,6,7};
        int key = 1;
        int searchResult = binarySearch(arr,key,0,arr.length-1,(arr.length-1)/2);
        if(searchResult==-1)
           System.out.println("Key Not Found");
         else
           System.out.println("Key found at index: "+searchResult);
    }
}
