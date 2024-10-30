class P1_LinearSearch_Iterative{
   public static void main(String[] args) {
    int[]arr = {1,2,3,4,5,6,8,10};
    int key = 9;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==key){
         System.out.println(key+" is present & its index is: "+i);
         System.exit(0);
        }
    }
    System.out.println("Key not found");
   }
}