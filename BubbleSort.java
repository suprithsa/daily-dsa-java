import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[]){
        int i,j,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
            System.out.println("enter the "+n+" element = ");
        for(i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println("the unsorted array are ");
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        for(i=0;i<n-1;i++)
            for(j=0;j<n-i-1;j++)
        if(arr[i]>arr[j+1]){
             temp = arr[j];
             arr[j] = arr[j+1];
             arr[j+1] = temp;
        }
        System.out.println("the sorted element are ");
        for(i=0;i<n;i++)
            System.out.println(arr[i]);

    }
}
