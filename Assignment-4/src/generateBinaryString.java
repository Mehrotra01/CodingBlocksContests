import java.util.ArrayList;
import java.util.Scanner;

public class generateBinaryString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        String bin = sc.next();
        String output="";
        int index=0;

        solve(bin,index,output);        
        System.out.println();
        }
        sc.close();
    }
    public static void solve(String b,int in,String ans){

       if(ans.length()==b.length()){
        System.out.print(ans+" ");
        ans="";
        return;
    }
    if(b.charAt(in)=='?'){
       solve(b, in+1, ans+"0"); 
       solve(b, in+1, ans+"1");
    } 
    else{
        solve(b,in+1,ans+b.charAt(in));
    } 
    
}
}
// selection == combination
// arrangement == permutation


// import java.util.ArrayList;
// import java.util.Scanner;

// public class generateBinaryString {
//     public static void main(String[] args) {
        
//         // Scanner sc = new Scanner(System.in);
//         String bin = "1??0?101";
//         priint(bin,0,"");
//         System.out.println();
//     }
// public static void priint(String b,int in,String ans){
//     if(ans.length()==b.length()){
//         System.out.print(ans+" ");
//         ans="";
//         return;
//     }
//     if(b.charAt(in)=='?'){
//        priint(b, in+1, ans+"0"); 
//        priint(b, in+1, ans+"1");
//     } 
//     else{
//         priint(b,in+1,ans+b.charAt(in));
//     } 
// }

// }