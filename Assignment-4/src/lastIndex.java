import java.util.Scanner;

public class lastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();

        }
        int target=sc.nextInt();
        sc.close();
        System.out.println( solve(arr,n-1,target));
    }
    static int solve(int[] arr,int index,int target){
        if (index < 0)
            return -1;
 
    // Return Statement
    if (arr[index] == target) {
        return index;
    }
 
    // Recursive Call
    return solve(arr, index - 1, target);
    }
}
