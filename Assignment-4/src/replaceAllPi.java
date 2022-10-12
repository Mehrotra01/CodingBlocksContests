import java.util.*;

public class replaceAllPi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int ab = 0; ab < t; ab++) {
            String str = sc.next();
            sc.close();
            String output = "";
            char ch[] = str.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == 'p' && ch[i + 1] == 'i') {
                    output += 3.14;
                    i++;
                } else {
                    output += ch[i];
                }
            }
            System.out.println(output);
        }
    }
}
