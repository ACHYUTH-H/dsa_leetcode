class Solution {
    public int[] asteroidCollision(int[] ast) {
        Stack<Integer> st = new Stack<>();

        for (int a : ast) {
            boolean destroyed = false;

            // Collision condition: Top moves right (> 0) and current moves left (< 0)
            while (!st.isEmpty() && st.peek() > 0 && a < 0) {
                if (st.peek() < -a) {
                    // Top asteroid is smaller -> it explodes, loop continues
                    st.pop();
                } else if (st.peek() == -a) {
                    // Both asteroids are equal size -> both explode
                    st.pop();
                    destroyed = true;
                    break;
                } else {
                    // Top asteroid is larger -> current asteroid 'a' explodes
                    destroyed = true;
                    break;
                }
            }

            // Push 'a' if it wasn't destroyed in a collision
            if (!destroyed) {
                st.push(a);
            }
        }

        // Convert stack to result array
        int[] ans = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        
        return ans;
    }
}