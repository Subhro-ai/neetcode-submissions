class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] target = new int[26];
        for(char c : s1.toCharArray()) {
            target[c - 'a']++;
        }
        for(int i = 0; i <= s2.length() - s1.length(); i++){
            int[] comp = new int[26];
            for(int k = i; k < i + s1.length(); k++) {
                comp[s2.charAt(k) - 'a']++;
            }
            if(Arrays.equals(target, comp)) return true;
        }
        return false;
    }
}