class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer, Integer > map = new HashMap<>();
        for(int[] element: grid){
            for(int i: element){
                map.put(i, map.getOrDefault(i, 0)+1);
            }
        }
        int ans [] = new int[2];
        for(int i: map.keySet()){
            if (map.get(i) >1) ans[0]=i;
        }
        for(int i=1; i<=grid.length*grid.length; i++){
            if(!map.containsKey(i)) ans[1]=i;           
        }
        return ans;
    }
}