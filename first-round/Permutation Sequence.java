public class Solution {
    public String getPermutation(int n, int k) {
        
        StringBuilder res = new StringBuilder();
        
        List<Integer> numbers = new ArrayList<>();
        int[] factorial = new int[n + 1];
        factorial[0] = 1;
        
        for (int i = 1; i <= n; i++) {
            factorial[i] = i * factorial[i - 1];
            numbers.add(i);
        }
        
        k--;
        
        for (int i = 1; i <= n; i++) {
            int index = k / factorial[n - i];
            res.append(String.valueOf(numbers.get(index)));
            numbers.remove(index);
            k -= index * factorial[n - i];
        }
        return String.valueOf(res);
    }
    
}