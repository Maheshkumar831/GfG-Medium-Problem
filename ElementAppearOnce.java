class Sol
{
    public static int search(int A[], int N)
    {
        int flag=0;
        for(int i=0;i<N;i++){
            flag^=A[i];
        }
        return flag;
    }
}
        
        
        
        /*  for(int i=0;i<N;i++){
            int flag=0;
            for(int j=0;j<N;j++){
                if(A[i]==A[j])
                    flag++;
                     
            }
            if(flag==1)
                return A[i];
        
        }
        return -1;
        
    }
}


Input:
N = 5
A = {1, 1, 2, 5, 5}
Output: 2
Explanation: 
Since 2 occurs once, while
other numbers occur twice, 
2 is the answer.
Example 2:

Input:
N = 7
A = {2, 2, 5, 5, 20, 30, 30}
Output: 20
Explanation:
Since 20 occurs once, while
other numbers occur twice, 
20 is the answer.
Expected Time Complexity: O(Log(N)).
Expected Auxiliary Space: O(1).
*/
