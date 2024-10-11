//{ Driver Code Starts
import java.util.*;
import java.util.Scanner;


// } Driver Code Ends
class Solution {
    public int maxDistance(int[] arr) {
        Map<Integer,Integer> firstOcc = new HashMap<>();
        Map<Integer,Integer> lastOcc = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(!firstOcc.containsKey(arr[i])){
                firstOcc.put(arr[i],i);
            }
            
            lastOcc.put(arr[i],i);
            
        }
        
        int maxDistance = 0;
        
        for(Integer key: firstOcc.keySet()){
            int temp = lastOcc.get(key) - firstOcc.get(key);
            maxDistance = Math.max(temp,maxDistance);
        }
        return maxDistance;
    }
}

//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            int[] arr = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            System.out.println(ob.maxDistance(arr));
        }
        sc.close();
    }
}
// } Driver Code Ends