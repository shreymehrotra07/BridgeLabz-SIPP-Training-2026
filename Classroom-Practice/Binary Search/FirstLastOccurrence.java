public class FirstLastOccurrence{
    static int firstOccurrence(int[] arr,int target){
        int l=0,r=arr.length-1,ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]==target){ans=m;r=m-1;}
            else if(arr[m]<target) l=m+1;
            else r=m-1;
        }
        return ans;
    }
    static int lastOccurrence(int[] arr,int target){
        int l=0,r=arr.length-1,ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]==target){ans=m;l=m+1;}
            else if(arr[m]<target) l=m+1;
            else r=m-1;
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr={1,2,2,2,3,4};
        System.out.println(firstOccurrence(arr,2));
        System.out.println(lastOccurrence(arr,2));
    }
}