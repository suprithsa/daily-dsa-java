import java.util.List;

public class DiagonalDiffrence {
    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int p=0,s=0;
       for(int i=0;i<arr.size();i++){
            p += arr.get(i).get(i);
         }
         for(int j=0;j<arr.size();j++){
            s += arr.get(j).get(arr.size()-j-1);
         }
         int sub = Math.abs(p-s);
         
         return sub;
    }
}
