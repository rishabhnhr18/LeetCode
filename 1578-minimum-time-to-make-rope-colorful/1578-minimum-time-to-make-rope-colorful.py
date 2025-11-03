class Solution:
    def minCost(self, colors: str, neededTime: List[int]) -> int:
        """
                i = 0
                j = 1
                minimum = 10**5
                time = 0

                #edge case, check if all colors are unique
                set_colors = set(colors)
                if len(colors) == len(set_colors): return 0

                while (j < (len(colors))):
                    minimum
                    while (colors[i] == colors[j]):
                        minimum = min(minimum, neededTime[j])
                        j+=1
                    
                    time += minimum

                    i=j
                    j+=1
                return time
        """

        # appraoch
        '''
        Keep only the maximu  time taking ballon, remove rest all adjecent one.
        '''



        i = 1
        time_set = []
        time_list = []
        time_needed = 0
        #edge case, check if all colors are unique
        set_colors = set(colors)
        if len(colors) == len(set_colors): return 0


        #logic
        while i <len(colors):
            count = 1
            if (colors[i] == colors[i-1]):
                while ((i<len(colors)) and (colors[i] == colors[i-1])):
                    if count == 1: time_set.append(neededTime[i-1])
                    time_set.append(neededTime[i])
                    count+=1
                    i+=1
            
                #logic to find min time
                if time_set:
                    time_list = sorted(time_set)
                    time_needed += sum(time_list[:-1])
            
            else:
                time_list = []
                time_set = []
                count = 1
                i+=1
        
        return time_needed

