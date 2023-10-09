//import java.math.BigInteger;
class Solution {
    static ArrayList<Integer> factorial(int N){
        ArrayList<Integer>list=new ArrayList<>();
        java.math.BigInteger fact=new java.math.BigInteger("1");
        for(int i=2;i<=N;i++){
            fact=fact.multiply(java.math.BigInteger.valueOf(i));
        }
        while(!fact.equals(java.math.BigInteger.ZERO)){
            int rem=fact.mod(java.math.BigInteger.TEN).intValue();
            list.add(rem);
            fact=fact.divide(java.math.BigInteger.TEN);
        }
        Collections.reverse(list);
        return list;
    }

}
/*      Input: N = 5
        Output: 120
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        for(int fact=2;fact<=N;fact++){
            int size=list.size();
            int carry=0;
            for(int i=0;i<size;i++){
                int temp=(fact*list.get(i))+carry;
                list.set(i,temp%10);
                carry=temp/10;
            }
            while(carry>0){
                list.add(carry%10);
                carry/=10;
            }
        }
        
        Collections.reverse(list);
        return list;
    }
}
*/
