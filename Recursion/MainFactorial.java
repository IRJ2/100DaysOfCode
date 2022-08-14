public class MainFactorial {
    public static void main(String[] args) {
        MainFactorial rec = new MainFactorial();
        var r = rec.getFibonacci(4);
        System.out.println(r);
    }
    public int getFibonacci(int n){
        if(n < 0){
            return -1;
        }
        if( n <= 1){
            return 1;
        }
        return n * ( n - 1 );
    }
}
