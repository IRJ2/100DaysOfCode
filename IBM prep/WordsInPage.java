import java.util.Scanner;

public class WordsInPage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line1 = sc.nextInt();
        int line2 = sc.nextInt();
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int result = 0;
        for(int i = 3; i <= n;i++){
            result = line1 + line2;
            line1 = line2;
            line2 = result;
        }
        System.out.println(result);

    }
    
}
