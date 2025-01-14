class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
     if(A==null || B==null | A.length!=B.length) return new int[0];
     Set<Integer> setA= new HashSet<>();
     Set<Integer> setB= new HashSet<>();
     int res[]=new int[A.length];
     for(int i=0; i<A.length; i++)
     {
        for(int j=0; j<=i;j++)
        {
            setA.add(A[i]);
            setB.add(B[i]);
        }
        int count=0;
        for(int element: setA)
        {
            if(setB.contains(element)) count++;;
        }
        res[i]=count;
     }   
     return res;
    }
}