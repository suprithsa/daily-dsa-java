import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        int val = 3;

        int i = 0;  // slow pointer

        for (int j = 0; j < arr.length; j++) {  // fast pointer
            if (arr[j] != val) {
                arr[i] = arr[j];
                i++;
            }
        }

        System.out.println("New length: " + i);

        for (int k = 0; k < i; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}