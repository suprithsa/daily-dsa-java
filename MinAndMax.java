public class MinAndMax {
    public static void main(String args[]){
        int[] arr = {10,20,30,40};
        int min = arr[0]; int max = arr[0];
        for(int x : arr){
        if(x > max)
            max = x;
        if(x < min)
            min = x;
    }
    System.out.println("maximum = "+max);
    System.out.println("minimum = "+min);
    }
}
