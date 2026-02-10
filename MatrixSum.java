import java.util.Scanner;

public class MatrixSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("enter the size of the row and column");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        System.out.println("enter the row "+n+" element and column "+m+" element");
        for(i=0;i<n;i++)
            for(j=0;j<m;j++)
         a[i][j] = sc.nextInt();
         System.out.println("matrix element are ");
         for(i=0;i<n;i++)
            for(j=0;j<m;j++)
        System.out.println(a[i][j]);
    }
}
