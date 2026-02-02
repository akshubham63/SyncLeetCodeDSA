class Solution {
    public boolean isPalindrome(int x) {
        String input = x + "";
        String result = "";
        for(int i = input.length() - 1; i >= 0; i--){
            result += input.charAt(i);
        }
        return result.equals(input);
    }
}