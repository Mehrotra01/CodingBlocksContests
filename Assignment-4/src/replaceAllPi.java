import java.util.*;

public class replaceAllPi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int ab = 0; ab < t; ab++) {
            String str = sc.next();
            String out = "";
            char ch[] = str.toCharArray();
            solve(ch,0,out);
        }
        sc.close();
    }
    public static void solve(char[] ch,int index,String out){
        if(index==ch.length){
            System.out.println(out);
            return;
        }
        if (ch[index] == 'p' && ch[index + 1] == 'i') {
                    out += 3.14;
                    index++;
                } else {
                    out += ch[index];
                }
                solve(ch, index+1, out);
    }
}
