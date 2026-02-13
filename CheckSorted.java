public class CheckSorted {
    public static void main(String args[]){
        int arr[] = {10,20,50,40};
        boolean is_sorted = true;
        for(int i = 0; i<arr.length - 1;i++){
        if(arr[i] > arr[i+1]){
            is_sorted = false;
        }
    }
       System.out.println("is_sorted = "+ is_sorted);
    }
}

