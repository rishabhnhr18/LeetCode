class Solution:
    def rotate_clockwise(self, mat: List[List[int]]) -> List[List[int]]:
        for row in range(0, len(mat)):
            for col in range(row, len(mat[0])):
                mat[row][col], mat[col][row] = mat[col][row], mat[row][col]
        
        for row in mat: row.reverse()

        return mat

    def findRotation(self, mat: List[List[int]], target: List[List[int]]) -> bool:
        count = 1

        while count <=4:
            equal = True
            i=0
            for row in range(len(mat)):
                for col in range(len(mat[0])):
                    if mat[row][col] != target[row][col]:
                        equal=False
                        break
                if not equal: break

            if equal: return True
            self.rotate_clockwise(mat) 
            count+=1
        
        return False