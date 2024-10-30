public class P2_LinearSearch_Recursive {
    public static int linearSearch(int[]arr, int key,int index){
       if(index==arr.length)
          return -1;
       if(arr[index]==key)
          return index;
        else
           return linearSearch(arr, key, index+1);
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
    int[]arr = {1,2,3,4,5,6,8,10};
    int key = 8;
    int index = 0;
    int searchResult = linearSearch(arr,key,index);
    if(searchResult==-1)
      System.out.println("Key Not Found");
    else
      System.out.println(key+" Key is present at index "+searchResult);
    }
}
/*
 * Another Approach (Problem Decomposition)
 * int LinearSearch(int[]arr,int size,int key){
 *    if(size==0)
 *        return -1;
 *    if(arr[size-1]==key)
 *         return size-1;
 *    return LinearSearch(arr,size-1,key);
 * }
 */