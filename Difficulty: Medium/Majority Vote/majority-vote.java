//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            int[] nums = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                nums[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.findMajority(nums);
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the majority elements in the array
    public int[] findMajority(int[] nums) {
        // Your code goes here.
        Map<Integer,Integer> map = new TreeMap<>();
        int n = nums.length;
        int threshold = n/3;
        
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        ArrayList<Integer> l = new ArrayList<>();
        for(Integer key: map.keySet()){
            if(map.get(key)>threshold){
                l.add(key);
            }
        }
        if(l.size()==0){
            return new int[]{-1};
        }
        
        int[] ans = new int[l.size()];
        
        for(int i=0;i<ans.length;i++){
            ans[i] = l.get(i);
        }
        return ans;
    }
}
