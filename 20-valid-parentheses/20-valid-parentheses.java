class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> arr = new ArrayList<Character>(s.length());
        int l = -1;
        char match;
        if(s.length()%2!=0)
            return false;
        ArrayList<Character> stack = arr;
        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            if(temp=='(' || temp == '{' || temp == '['){
                arr.add(temp);
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

