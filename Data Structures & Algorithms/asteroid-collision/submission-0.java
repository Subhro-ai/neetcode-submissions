class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for( int x : asteroids) {
            while(!stack.isEmpty() && x < 0 && stack.peek() > 0) {
                int diff = x + stack.peek();
                if(diff < 0) {
                    stack.pop();
                }
                else if(diff > 0) {
                    x = 0;
                }
                else {
                    x = 0;
                    stack.pop();
                }
            }
            if(x != 0) stack.add(x);
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }
}