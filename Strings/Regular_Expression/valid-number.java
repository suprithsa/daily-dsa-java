class Solution {
    public boolean isNumber(String s) {
        String valid =  "^[+-]?((\\d+\\.?\\d*)|(\\.\\d+))([eE][+-]?\\d+)?$";

        return s.matches(valid);
    }
}