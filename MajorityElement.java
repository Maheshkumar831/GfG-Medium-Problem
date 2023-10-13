class Solution
{
    static int majorityElement(int a[], int size)
    {
       
        int count=0;
        int cand=0;
        for(int i=0;i<size;i++){
            if(count==0){
                count=1;
                cand=a[i];
            }
            else if(cand==a[i]){
                count++;
            }
            else{
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<a.length;i++){
            if(cand==a[i]){
                count1++;
            }
            
        }
        if(count1>size/2)
            return cand;
        else
            return -1;
        
        
    }
}
/*
Input:
N = 3 
A[] = {1,2,3} 
Output:
-1
Explanation:
Since, each element in 
{1,2,3} appears only once so there 
is no majority element.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
  */
