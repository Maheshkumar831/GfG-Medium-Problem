class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        Map<Integer,Integer>prevMap=new HashMap<>();    //HashMap  TC:O(N)  SC:O(N)
        int sum=0;
        int maxLen=0;
        for(int i=0;i<N;i++){
            sum+=A[i];
            if(sum==K){
                maxLen=Math.max(maxLen,i+1);
            }
            int rem=sum-K;
            if(prevMap.containsKey(rem)){
                int len=i-prevMap.get(rem);
                maxLen=Math.max(maxLen,len);
            }
            if(!prevMap.containsKey(sum)){
                prevMap.put(sum,i);
            }
        }
        return maxLen;
    }
}
        
        
        
        
        
     /*   
        
        
       int len=0;
        for(int i=0;i<N;i++){           Brute Force:TC-O(N^2)    SC-O(1)
            int sum=0;
            for(int j=i;j<N;j++){
                sum+=A[j];                    //EXTREME TIME LIMIT
            if(sum==K){
                len=Math.max(len,j-i+1);
                
            }
            
            }
        }
        return len;
    }
      int i=0;                               //OPTIMAL APPROACH,TWO POINTER
        int j=0;
        int sum=A[0];                     //ALL TEST CASES ARE NOT PASSED   TC:N SC:1
        int maxLen=0;
        while(j<N){//0<17,1,2
            while(i<=j && sum>K){22>15 25>15
                sum-=A[i];//22-13=9,25,19,19-15=4
                i++;//1,2,3
                
            }
            if(sum==K){
                maxLen=Math.max(maxLen,j-i+1);
                
            }
            j++;//1 2 3 4,5,6,7,8,9
            if(j<N){
                
                sum+=A[j];//-13, 7,22,25,4+2=6,-6,11,-5,-5,-8,-8+19=11,8,10,
            }
        }
        return maxLen;
    }
}
    
    
}



Input :
A[] = {10, 5, 2, 7, 1, 9}
K = 15
Output : 4
Explanation:
The sub-array is {5, 2, 7, 1}.
Example 2:

Input : 
A[] = {-1, 2, 3}
K = 6
Output : 0
Explanation: 
There is no such sub-array with sum 6.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).
*/

 
