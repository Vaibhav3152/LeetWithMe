class Solution {
    public long sumAndMultiply(int n) {
        int reversedNumWithoutZeros = 0;
        int sum = 0;
        
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            
            if (digit != 0) {
                reversedNumWithoutZeros = (reversedNumWithoutZeros * 10) + digit;
            }
            n = n / 10;
        }

        int finalNum = 0;
        while (reversedNumWithoutZeros > 0) {
            finalNum = (finalNum * 10) + (reversedNumWithoutZeros % 10);
            reversedNumWithoutZeros /= 10;
        }
        
        return (long) finalNum * sum;
    }
}