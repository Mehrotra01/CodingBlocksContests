import java.util.Scanner;

public class stringToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        int res=0;
    for(int i=0;i<str.length();i++){
        res = res * 10 + ((int)str.charAt(i) - 48); 
    }        
    System.out.println(res);
    sc.close();
    }
}
