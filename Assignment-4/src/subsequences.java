import java.util.ArrayList;
import java.util.Scanner;

public class subsequences {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ans = new ArrayList<>();
        String str = sc.next();
        solve(str, ans, new String(), 0);


        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

        int count = (int) Math.pow(2, str.length());
        System.out.printf("\n%d", count);
        sc.close();
    }

    private static void solve(String str, ArrayList<String> ans, String output, int idx) {
        if (idx == str.length()) {
            ans.add(new String(output));
            return;
        }
        solve(str, ans, output, idx + 1);
        output += str.charAt(idx);
        solve(str, ans, output, idx + 1);
    }
}