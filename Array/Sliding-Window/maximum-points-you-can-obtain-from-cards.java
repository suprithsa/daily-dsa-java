class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total=0;
        for(int card:cardPoints){
             total +=card;
        }
        if(n==k){
            return total;
       }

        int window = n-k;
        int current = 0;
        for(int i=0;i<window;i++){
            current += cardPoints[i];
        }
        int minsum = current;

        for(int i=window;i<n;i++){
            current += cardPoints[i];
            current -= cardPoints[i-window];
            minsum = Math.min(minsum,current);
        }
        return total-minsum;
    }
}