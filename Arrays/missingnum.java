// Find the missing number in an integer array of 1 to 10.

import java.util.*;
public class missingnum {
    public static void main(String[] args) {
        missingnum ob = new missingnum();
        int intArray[] = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        ob.missingNumber(intArray); // 7
    }
    public void missingNumber(int[] intArray) {
        // TODO
        for(int i = 1;i < intArray.length; i++){
            if(intArray[i] != (1 + intArray[i-1])){
                System.out.print(1 + intArray[i-1]);
            }
        }
    }
}
