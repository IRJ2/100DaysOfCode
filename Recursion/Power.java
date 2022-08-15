class Power{
    public static void main(String[] args) {
        Power ob = new Power();
        System.out.print(ob.power(2, 0));
    }
    public int power(int base, int exponent) {
        if(exponent < 0 ){
            return -1;
        }
        if(exponent == 0){
            return 1;
        }
        return base * power(base , exponent - 1);
    }
}