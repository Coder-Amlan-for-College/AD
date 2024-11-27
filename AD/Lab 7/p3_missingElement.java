public class p3_missingElement {
  public static void main(String[] args) {
    int n=9;  
    int[]arr = {1,5,4,3,2,7,8,9};
    int sum1 = n*(n+1)/2;
    int sum2 = 0;
    for(int i=0;i<n-1;i++){
        sum2+=arr[i];
    } 
    int missingNum = sum1-sum2;
    System.out.println("Missing Number: "+missingNum); 
  }
}
