public class MoveZeroes {

    public static void moveZeroes(int[] arr) {
        int i = 0; // slow pointer

        for (int j = 0; j < arr.length; j++) { // fast pointer
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};

        moveZeroes(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
