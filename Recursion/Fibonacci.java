public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci ob = new Fibonacci();
        System.out.print(ob.fib(4));
    }
    public int fib(int n) {
        // TODO
        if(n < 0){
            return -1;
        }
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
