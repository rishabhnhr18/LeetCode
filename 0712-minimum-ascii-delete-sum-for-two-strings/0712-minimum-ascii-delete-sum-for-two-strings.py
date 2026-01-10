class Solution:
    def minimumDeleteSum(self, s1: str, s2: str) -> int:
        #     dp = [len(s1)][len(s2)]        
        #     def solve(s1: str, s2: str, i:int, j: int, dp) -> int:
        #         """
        #         Solving the solytion with dp approach
        #         """

        #         if i>=len(s1):
        #             sum = [total+= chr(x) for x in s2[i::]]
        #         if 2>=len(s2):
        #             sum = [total+= chr(x) for x in s2[i::]]
                
        #         if dp[i][j]!= -1: return dp[i][j]

        #         if s1[i] == s2[j]:
        #             dp[i][j] = solve(s1, s2, i+1, j+1, dp)
        #             return dp[i][j]
        #         else:
        #             dp[i][j] = min(solve(s1,s2,i+1,j, dp), solve(s1,s2,i,j+1,dp))
        #             return dp[i][j]
        # return solve(s1,s2,0,0,dp)


        from functools import lru_cache
        
        @lru_cache(None)
        def solve(i: int, j: int) -> int:
            if i == len(s1):
                return sum(ord(c) for c in s2[j:])
            
            if j== len(s2):
                return sum(ord(c) for c in s1[i:])
            
            if s1[i] == s2[j]: return solve(i+1, j+1)

            delete_1 = ord(s1[i]) + solve(i+1, j)
            delete_2 = ord(s2[j]) + solve(i, j+1)

            return min(delete_1, delete_2)

        return solve(0,0)