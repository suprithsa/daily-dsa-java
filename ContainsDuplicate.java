import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 3};

        HashSet<Integer> set = new HashSet<>();
        boolean isDuplicate = false;

        for (int num : arr) {
            if (set.contains(num)) {
                isDuplicate = true;
                break;
            }
            set.add(num);
        }

        if (isDuplicate) {
            System.out.println("Array contains duplicate elements");
        } else {
            System.out.println("Array does not contain duplicate elements");
        }
    }
}

