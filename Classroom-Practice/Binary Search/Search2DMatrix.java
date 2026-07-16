public class Search2DMatrix{
    public static boolean searchMatrix(int[][] matrix,int target){
        int rows=matrix.length,cols=matrix[0].length;
        int l=0,r=rows*cols-1;
        while(l<=r){
            int m=l+(r-l)/2;
            int row=m/cols,col=m%cols;
            if(matrix[row][col]==target) return true;
            if(matrix[row][col]<target) l=m+1;
            else r=m-1;
        }
        return false;
    }
    public static void main(String[] args){
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix,3));
    }
}