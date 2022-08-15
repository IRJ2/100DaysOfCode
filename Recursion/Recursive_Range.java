public class Recursive_Range {
    public static void main(String[] args) {
        Recursive_Range ob = new Recursive_Range();
        System.out.print(ob.recursiveRange(6));
    }
    public int recursiveRange(int num) {
        if(num < 0){
            return -1;
        }
        if(num == 0){
            return 0;
        }
        return num + recursiveRange( num -1);
    } 
}
