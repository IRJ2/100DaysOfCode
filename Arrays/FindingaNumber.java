public class FindingaNumber {
    public static void main(String[] args) {
        FindingaNumber ob = new FindingaNumber();
        int[] intArray = {1,2,3,4,5,6};
        System.out.print(ob.searchInArray(intArray, 6));
    }
    public int searchInArray(int[] intArray, int valueToSearch) {
        // TODO
        for(int i = 0;i < intArray.length; i++){
            if(intArray[i] == valueToSearch){
                return i;
            }
        }
        return -1;
    }
}
