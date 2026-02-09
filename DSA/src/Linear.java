import java.util.Scanner;
import static java.lang.System.*;

public class Linear {
    public static void main(String[] args){
        int i,key;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the "+n+" element = ");
        for(i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println("enter the elemenet to be searched = ");
        key = sc.nextInt();
        for(i=0;i<n;i++) {
            if (key == arr[i]) {
                System.out.println("the element " + key + " found at position " +(i+1));
                exit(0);
            }
        }
            System.out.println("the element not found");


    }
}
