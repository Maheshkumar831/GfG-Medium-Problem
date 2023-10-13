class Solution {

    void printDiamond(int n) {
         for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");//space
            }
            for(int k=0;k<i+1;k++){
                System.out.print("* ");//star
            }
            for(int l=0;l<n-i-1;l++){
                System.out.print(" ");//space
            }
             System.out.println();
        }
         for(int i=n;i>0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){//or 2n-(2i+1)
                System.out.print("* ");
            }
            for(int l=0;l<n-i;l++){
                System.out.print(" ");
            }
            System.out.println();
        }
       
    }
}
/*
For Input: 
5
Your Output: 
    *    
   * *   
  * * *  
 * * * * 
* * * * *
* * * * *
 * * * * 
  * * *  
   * *   
    *    
*/
