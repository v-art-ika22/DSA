class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;String str = s+t;
        for(int i=0;i<str.length();i++){
            c^=str.charAt(i);
        }
        return c;
    }
}