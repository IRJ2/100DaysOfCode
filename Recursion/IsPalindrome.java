public class IsPalindrome {
    public static void main(String[] args) {
        IsPalindrome ob = new IsPalindrome();
        System.out.print(ob.isPalindrome("olo"));
    }
    public  boolean isPalindrome(String s)
    {   
        // TODO
        if(s.length() == 0){
            return true;
        }
        if(s.length() == 1){
            return true;
        }
        else if(s.charAt(0) == s.charAt(s.length() - 1)){
            return isPalindrome(s.substring(1, s.length() - 1) );
        }
        else{
            return false;
        }
    }
}
