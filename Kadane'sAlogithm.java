class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        long max=arr[0],sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            max=Math.max(max,sum);
            if(sum<0)
                sum=0;
            
        }
        return max;
        
    }
    
}

/*N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


long max=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];//-1,-3,-6,,-10
                //System.out.println(sum);
            max=Math.max(sum,max);//-1
                
            }
                
                
            
        }
        return max;
*/
        
