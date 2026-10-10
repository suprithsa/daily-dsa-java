class Solution {
    public String simplifyPath(String path) {
       Stack<String> stack = new Stack<>();

       String[] part = path.split("/");
       for(String parts : part){
        if(parts.equals("") || parts.equals(".")){
            continue;
        }
        else if(parts.equals("..")){
            if(!stack.isEmpty()){
                stack.pop();
            }
        }
        else{
            stack.push(parts);
        }
       }
       StringBuilder result = new StringBuilder();

       for(String dir : stack){
        result.append("/").append(dir);
       }
       return result.length() == 0?"/":result.toString();
    }
}