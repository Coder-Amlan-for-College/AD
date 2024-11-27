public class p5_maximumDifference {
    public static void main(String[] args) {
        int[]arr = {1,6,4,19,17,20};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int diff = Math.abs(arr[i]-arr[j]);
                if(diff>max){
                    max = diff;
                }
            }    
        }
        System.out.println("Maximum difference is: "+max);
    }
}
