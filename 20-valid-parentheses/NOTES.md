class Solution {
public boolean isValid(String s) {
ArrayList<Character> arr = new ArrayList<Character>(s.length());
int l = -1;
char match;
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
while(stack.get(l)!=match && l>0){
stack.remove(l);
l--;
}
stack.remove(l);
l--;
}
}
if(l<0)