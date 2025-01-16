class Solution {
    public int minimizeXor(int num1, int num2) {
        int count = Integer.bitCount(num2); // Number of 1s in num2
        int res = 0;

        // Set bits from num1 in the same positions as num1, as long as count > 0
        for (int i = 31; i >= 0 && count > 0; i--) {
            if ((num1 & (1 << i)) != 0) {
                res |= (1 << i);
                count--;
            }
        }

        // If count > 0, set remaining bits from the least significant bit (LSB)
        for (int i = 0; i <= 31 && count > 0; i++) {
            if ((res & (1 << i)) == 0) { // If the bit is not already set
                res |= (1 << i);
                count--;
            }
        }

        return res;
    }
}
