#Code correct but getting TLE
'''
class Solution:
    p: List[List[int]]
    mod = 12345
    def constructProductMatrix(self, grid: List[List[int]]) -> List[List[int]]:
        self. p =  [[None for _ in grid[0]] for _ in grid]

        #multiply with that element also that need to be excluded
        multi = 1
        for row in range(len(grid)):
            for col in range(len(grid[0])):       
                multi*=grid[row][col]

        for row in self.p:
            for col in range(len(row)):
                row[col] = multi

        #iterate again and divide by that number
        for row in range(len(grid)):
            for col in range(len(grid[0])):
                self.p[row][col] = (multi // grid[row][col]) % self.mod
        return self.p
'''

class Solution:
    def constructProductMatrix(self, grid: List[List[int]]) -> List[List[int]]:
        rows = len(grid)  
        columns = len(grid[0])
        res = [[1]*columns for _ in range(rows)]
        mod = 12345

        #calcuate Prefix
        prefix = 1
        for row in range(rows):
            for col in range(columns):
                res[row][col] = (prefix)%mod
                prefix = (prefix * grid[row][col])%mod

        #Calculate Suffix
        suffix = 1
        for row in range(rows-1, -1, -1):
            for col in range(columns-1, -1, -1):
                res[row][col] = (res[row][col]*suffix)%mod
                suffix = (suffix *grid[row][col])%mod

        return res