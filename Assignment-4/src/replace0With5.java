import java.util.Scanner;

public class replace0With5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long res=0;
        int i=0;
        while(n>0){
            long rem=n%10;
            n=n/10;
            if(rem==0){
                res+=Math.pow(10,i)*5;
i++;
            }else{
            res+=Math.pow(10,i)*rem;
            i++;}
        }
        System.out.println(res);
        sc.close();
    }
}
