import java.util.ArrayList;
import java.util.Scanner;

public class allINdexes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target= sc.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        solve(arr,0,target,res);
        for (int i = 0; i < res.size();i++) 
        { 		      
            System.out.print(res.get(i)+" "); 		
        }   
        sc.close();
    }
    private static void solve(int[] arr,int index,int target,ArrayList<Integer> res){
if(arr[index]==target){
    res.add(index);
}
if(index>=arr.length-1){
    return;
}
solve(arr, index+1, target, res);

    }

}
