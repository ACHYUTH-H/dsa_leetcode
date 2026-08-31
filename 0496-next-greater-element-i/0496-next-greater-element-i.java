import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        // 1. Process nums2 right-to-left to build next greater map
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }
            nextGreater.put(nums2[i], st.isEmpty() ? -1 : st.peek());
            st.push(nums2[i]);
        }

        // 2. Map answers directly to nums1
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nextGreater.get(nums1[i]);
        }

        return nums1;
    }
}