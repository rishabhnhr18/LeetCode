class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        if(arr==null || mat==null) return -1;
        Map<Integer, int[]> map=new HashMap<>();
        int rowCount=mat.length;
        int colCount=mat[0].length;
        for(int i=0; i<rowCount; i++)
        {
            for(int j=0; j<colCount; j++)
            {
                map.put(mat[i][j], new int[]{i,j});
            }
        }
        int[] rowPaint=new int[rowCount];
        int[] colPaint=new int[colCount];
        for(int i=0; i<arr.length; i++)
        {
            int[] pos =map.get(arr[i]);
            int row=pos[0];
            int col=pos[1];
            rowPaint[row]++;
            colPaint[col]++;
            if(rowPaint[row]==colCount || colPaint[col]==rowCount) return i;
        }
        return -1;
    }
}