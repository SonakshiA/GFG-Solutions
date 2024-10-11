//{ Driver Code Starts
import java.util.*;

class ExtraElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n - 1];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n - 1; i++) b[i] = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.findExtra(n, a, b));
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/
class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        // add code here.
        HashMap<Integer,Integer> m1 = new HashMap<>();
        HashMap<Integer,Integer> m2 = new HashMap<>();
        
        for(int i=0;i<n;i++){
            m1.put(arr1[i],i);
        }
        
        for(int i=0;i<n-1;i++){
            m2.put(arr2[i],i);
        }
        
        for(Integer key: m1.keySet()){
            if(!m2.containsKey(key)){
                return m1.get(key);
            }
        }
        return -1;
    }
}