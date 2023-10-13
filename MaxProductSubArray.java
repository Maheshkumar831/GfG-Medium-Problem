class Solution {
    // Function to find maximum product subarray
    
    long maxProduct(int[] arr, int n) {
        long maxProd=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            long prod=1;
            for(int j=i;j<n;j++){
                prod*=(long)arr[j];//6,-18,180
                if(prod>maxProd){//6>0=6,
                    maxProd=prod;//6
            
            }
                
            }
            
            
        }
        return maxProd;
    }
}
/*
Input:
N = 5
Arr[] = {6, -3, -10, 0, 2}
Output: 180
Explanation: Subarray with maximum product
is [6, -3, -10] which gives product as 180.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
  */
