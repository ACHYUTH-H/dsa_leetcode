import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int cur = nums[i % n];

            // 1. Pop all elements smaller than or equal to current element
            while (!st.isEmpty() && st.peek() <= cur) {
                st.pop();
            }

            // 2. Record answer BEFORE pushing cur (only for actual indices i < n)
            if (i < n) {
                ans[i] = !st.isEmpty() ? st.peek() : -1;
            }

            // 3. Push current element onto the stack
            st.push(cur);
        }

        return ans;
    }
}