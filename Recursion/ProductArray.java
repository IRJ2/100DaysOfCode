public class ProductArray {
    public static void main(String[] args) {
        ProductArray ob = new ProductArray();
        int A[]={ 1, 2, 3, 4, 5 };
        System.out.print(ob.productofArray(A, A.length));
    }
    public int productofArray(int A[], int N) 
    { 
    //   TODO
    if(N <= 0){
        return 1;
    }
    return  A[N - 1] * productofArray(A, N - 1) ;
    }
    
}
