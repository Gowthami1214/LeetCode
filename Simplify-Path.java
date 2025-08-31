class Solution {
    public String simplifyPath(String path) {
     Stack<String> stack=new Stack<>();
     String[] str=path.split("/");
     for(String part:str){
        if(part.equals("") || part.equals(".")){
            continue;
        }
        else if(part.equals("..")){
             if (!stack.isEmpty()) stack.pop();
        }
        else
        {
            stack.push(part);
        }
     } 
     String result = "/" + String.join("/", stack);
     return result;
    }
}