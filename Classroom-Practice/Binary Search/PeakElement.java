public class PeakElement{
    public static int findPeak(int[] arr){
        int l=0,r=arr.length-1;
        while(l<r){
            int m=l+(r-l)/2;
            if(arr[m]<arr[m+1]) l=m+1;
            else r=m;
        }
        return l;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,1};
        System.out.println(findPeak(arr));
    }
}