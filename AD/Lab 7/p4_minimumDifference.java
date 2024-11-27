public class p4_minimumDifference {
    public static void main(String[] args) {
        int[]arr = {1,6,4,19,17,20};
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int diff = Math.abs(arr[i]-arr[j]);
                if(diff<min){
                    min = diff;
                }
            }    
        }
        System.out.println("Minimum difference is: "+min);
    }
}
