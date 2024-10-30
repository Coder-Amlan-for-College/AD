public class p1_firstRepeatedElement {
  public static void main(String[] args) {
    int[]arr = {1,3,4,5,2,3};
    int i=0;
    for(;i<arr.length-1;i++){
      for(int j=i+1;j<arr.length;j++){
          if(arr[i]==arr[j]){
          System.out.println("First Repeated Element is: "+arr[i]);
          System.exit(0);
        } 
      }
      System.out.println("No Element is repeated");
    }
  }
    
}