import java.util.*;

public class oddEvenUsingRecursion {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n);
        sc.close();
    }

    static public void solve(int n) {
        if (n <= 0) {
            return;
        }
        if (n % 2 != 0) {
            System.out.println(n);
        }
        solve(n - 1);
        if (n % 2 == 0) {
            System.out.println(n);
        }
    }
}
