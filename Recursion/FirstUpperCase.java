public class FirstUpperCase {
    public static void main(String[] args) {
        System.out.print(first("Hello"));
    }
    static char first(String str) {
        //   TODO
        if(str.isEmpty()){
            return ' ';
        }
        if(str.charAt(0) >= 'A' && str.charAt(0) <= 'Z' ){
            return str.charAt(0);
        }
        return first(str.substring(1));
    }
}
