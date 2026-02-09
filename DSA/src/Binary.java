import java.util.Scanner;
import static java.lang.System.exit;

public class Binary {
    public static void main(String args[]){
        int i,key,low,high,mid;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the "+n+" element = ");
        for(i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println("enter the element to be searched = ");
        key = sc.nextInt();
        low=0;
        high=n;
        while(low<=high){
            mid=(low+high)/2;
            if(key==arr[mid]){
                    System.out.println("the element "+key+" found at position "+(i=1));
                    exit(0);
            }
            if(key<arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        System.out.println("element not found");
    }
}
