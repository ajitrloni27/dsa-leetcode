class Solution {
    public void reverseString(char[] s) {
        char temp;
        for(int i=0; i<s.length/2; i++){      // traverse half of the string
            temp= s[i];                         // assign 1st character
            s[i]= s[s.length-1 -i];             // swap 
            s[s.length-1-i]= temp;              // swap from last to first 
        }    
    }
}
