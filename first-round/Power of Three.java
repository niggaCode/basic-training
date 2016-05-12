public class Solution {
    public boolean isPowerOfThree(int n) {
        //return n > 0 && (n == 1 || (n % 3 == 0 && isPowerOfThree(n/3)));
        if (n > 0) {
            while (n % 3 == 0){
                n /= 3;
            }
        }
        return n == 1;
    }
}