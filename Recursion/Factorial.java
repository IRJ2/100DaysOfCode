public class Factorial {
    public static void main(String[] args) {
        Factorial ob = new Factorial();
        System.out.print(ob.factorial(4));
    }
    public int factorial(int num) {
        if(num < 0 ){
            return -1;
        }
        if(num == 0){
            return 1;
        }
        return num * factorial(num-1);
    }
}
