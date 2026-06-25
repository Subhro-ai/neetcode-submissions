/*
 * @lc app=leetcode id=424 lang=java
 *
 * [424] Longest Repeating Character Replacement
 */

// @lc code=start
class Solution {
    public int characterReplacement(String s, int k) {
        char[] chars = s.toCharArray();
        int[] count = new int[26];
        int maxCount = 0;
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < chars.length; right++) {
            int size = right - left + 1;
            count[chars[right] - 'A']++;
            maxCount = Math.max(maxCount, count[chars[right] - 'A']);
            if(size - maxCount <= k) {
                maxLength = Math.max(maxLength, size);
            } else {
                count[chars[left] - 'A']--;
                left++;
            }
        }
        return maxLength;
    }
}
// @lc code=end

