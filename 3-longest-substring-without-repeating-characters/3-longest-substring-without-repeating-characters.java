class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> symbols = new HashSet<Character> (); 
        int l=0;
        int res=0;
        for(int i=0;i<s.length();i++){
            while(symbols.contains(s.charAt(i))){
                symbols.remove(s.charAt(l));
                l++;
            }
            res=Math.max(res,i-l+1);
            symbols.add(s.charAt(i));
        }
        return res;
    }
}
