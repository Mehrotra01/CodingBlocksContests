import java.util.Scanner;

public class firstIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();

        }
        int target=sc.nextInt();
        sc.close();
        System.out.println( solve(arr,0,target));
    }
    static int solve(int[] arr,int index,int target){
        if (index == arr.length)
            return -1;
 
    // Return Statement
    if (arr[index] == target) {
        return index;
    }
 
    // Recursive Call
    return solve(arr, index + 1, target);
    }
}