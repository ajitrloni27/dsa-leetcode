class Solution {
    public boolean isPalindrome(int x) {
        int original = x; 
        int reversed = 0;
        while (x > 0) {
            int d = x % 10;
            reversed = reversed * 10 + d; 
            x = x / 10;
        }
        if (original == reversed) {
            return true;
        }
        return false;
    }
}
