import java.util.Scanner;

public class stringToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.next();
        int ans = 0;

        for (int i = 0; i < nums.length(); i++) {
            ans = ans * 10 + ((int) nums.charAt(i) - 48);
        }
        System.out.println(ans);
        sc.close();
    }
}
