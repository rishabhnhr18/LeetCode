class Solution:
    __slots__ = ['row', 'col', 't']
    mod = 1e9+7
    
    t: List[List[Tuple[int, int]]]
    def solve(self, i: int, j: int, grid: List[List[int]]) ->tuple:
        if i == self.row-1 and j == self.col-1: return (grid[i][j], grid[i][j])

        #using recursion
        #1. Moving right - row same, col adds
        maxi = float('-inf')
        mini = float('inf')
        if self.t[i][j]: return self.t[i][j]
        if j<self.col-1:
            right_maxi, right_mini = self.solve(i, j+1, grid)
            maxi = max(maxi, grid[i][j]*right_mini, grid[i][j]*right_maxi)
            mini = min(mini, grid[i][j]*right_mini, grid[i][j]*right_maxi)

        #2. Moving Down - row adds, col same
        if i< self.row-1:
            down_maxi, down_mini = self.solve(i+1, j, grid)
            maxi = max(maxi, grid[i][j]*down_mini, grid[i][j]*down_maxi)
            mini = min(mini, grid[i][j]*down_mini, grid[i][j]*down_maxi)
        
        self.t[i][j] = (maxi, mini) 
        return (maxi, mini)

    def maxProductPath(self, grid: List[List[int]]) -> int:
        self.row = len(grid)
        self.col = len(grid[0])
        
        #iitilaize t
        self.t = [[None for _ in range(self.col)] for _ in range(self.row)]
        maxi, mini = self.solve(0,0, grid)

        return -1 if maxi < 0 else int(maxi % self.mod)