class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();

        for(String ops:operations){
            if(ops.equals("C")){
                s.pop();
            }
            else if(ops.equals("D")){
              int prev = s.peek();
              s.push(prev*2);
            }
            else if(ops.equals("+")){
                int last = s.pop();
                int secondlast = s.peek();

                int sum = last+secondlast;

                s.push(last);
                s.push(sum);
 
            }
            else{
                s.push(Integer.parseInt(ops));
            }
        }
        int total =0;
        for(int score : s){
            total += score;
        }
        return total;
    }
}