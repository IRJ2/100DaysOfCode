class SumOfDigits {
    public static void main(String[] args) {
        SumOfDigits rec = new SumOfDigits();
        var r = rec.getSum(-123);
        System.out.println(r);
    }
    public int getSum( int n){
        if(n == 0 || n < 0){
            return 0;
        }
        return n % 10 + getSum(n/10);
    }
    
}
