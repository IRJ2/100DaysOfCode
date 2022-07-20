class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> stack = new ArrayList<Character>(s.length());
        int l = -1;//points to the top of the stack
        char match; //temperorily store closing parenthesis
        if(s.length()%2!=0)
            return false;
        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            if(temp=='(' || temp == '{' || temp == '['){
                stack.add(temp);
                l++;
            }
            else{
                
                if(temp == '}')
                    match='{';
                else if(temp == ']')
                    match = '[';
                else
                    match = '(';
                if(l>=0){
                    if(stack.get(l)==match){
                        stack.remove(l);
                        l--;
                    }
                    else
                        return false;
                }
                else
                    return false;
            }
        }
        if(l<0)
            return true;
        else{
            return false;
        }
    }
}

