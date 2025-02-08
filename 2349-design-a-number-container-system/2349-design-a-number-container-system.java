import java.util.*;

class NumberContainers {
    // Map from index to number
    private Map<Integer, Integer> indexToNumbers;
    // Map from number to a sorted set of indexes
    private Map<Integer, TreeSet<Integer>> numbersToIndex;

    public NumberContainers() {
        indexToNumbers = new HashMap<>();
        numbersToIndex = new HashMap<>();
    }

    public void change(int index, int number) {
        // If the index already has a number, remove it from the numbersToIndex map
        if (indexToNumbers.containsKey(index)) {
            int oldNumber = indexToNumbers.get(index);
            numbersToIndex.get(oldNumber).remove(index);
            // If the set becomes empty, remove the entry from the map
            if (numbersToIndex.get(oldNumber).isEmpty()) {
                numbersToIndex.remove(oldNumber);
            }
        }

        // Update the indexToNumbers map
        indexToNumbers.put(index, number);

        // Update the numbersToIndex map
        numbersToIndex.computeIfAbsent(number, k -> new TreeSet<>()).add(index);
    }

    public int find(int number) {
        // If the number exists in the numbersToIndex map, return the smallest index
        if (numbersToIndex.containsKey(number) && !numbersToIndex.get(number).isEmpty()) {
            return numbersToIndex.get(number).first();
        }
        // Otherwise, return -1
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */