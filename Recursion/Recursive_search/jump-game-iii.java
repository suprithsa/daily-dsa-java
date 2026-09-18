class Solution {

    public boolean canReach(int[] arr, int start) {

        
        if (arr[start] == 0) {
            return true;
        }

        
        if (arr[start] == -1) {
            return false;
        }

       
        int jump = arr[start];
        arr[start] = -1;

        int right = start + jump;

        if (right < arr.length && canReach(arr, right)) {
            return true;
        }

     
        int left = start - jump;

        if (left >= 0 && canReach(arr, left)) {
            return true;
        }

        return false;
    }
}