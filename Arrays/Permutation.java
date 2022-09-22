public class Permutation {
    public static void main(String[] args) {
        Permutation ob = new Permutation();
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,1,2,3,4};
        System.out.print(ob.permutation(array1, array2));
    }
    public boolean permutation(int[] array1, int[] array2){
        // TODO
        if(array1.length != array2.length){
            return false;
        }
        int mult1 = 1 , mult2 = 1 , sum1 = 0 , sum2 = 0;
        for(int i = 0; i < array1.length; i++){
            mult1 *= array1[i];
            mult2 *= array2[i];
            sum1 += array1[i];
            sum2 += array2[i];
        }
        if(mult1 == mult2 && sum1 == sum2){
            return true;
        }
        return false;
    }
}
