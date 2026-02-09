import java.util.Scanner;

public class Array {
    public static void main(String args[]){
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
            System.out.println("enter the "+n+" element = ");
        for(i=0;i<n;i++)
            arr[i] = sc.nextInt();
        for(i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}

