class p3_BinarySearch_iterative{
    public static int binarySearch(int[]arr,int key){
    int low = 0, high = arr.length-1 , mid=0;
       while(low<=high)
       {
        mid = (low+high)/2;
        if(arr[mid]==key)
          return mid;
        if(arr[mid]<key)
          low = mid+1;
        else
          high = mid-1;
       }
       return -1;
    }
    public static void main(String[] args) {
       int[]arr ={1,2,3,4,5,6,7};
       int key = 10;
       int searchResult = binarySearch(arr,key);
       if(searchResult==-1)
          System.out.println("Key Not Found");
        else
          System.out.println("Key found at index: "+searchResult);
    }
}