public class StringReversal {
    public static void main(String[] args) {
        StringReversal ob = new StringReversal();
        System.out.print(ob.reverse(""));
    }
    public String reverse(String str)
    {   
        if(str.length() <= 0){
            return "-1";
        }
        if(str.length() == 1){
            return str;
        }
        return reverse(str.substring(1))+str.charAt(0);
    }
}
