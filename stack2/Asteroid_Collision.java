package stack2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Asteroid_Collision {
    public static void main(String[] args) {
        int arr[] = {5, 10, -5};
        System.out.println(Arrays.toString(asteroidCollision(arr)));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        int size = asteroids.length;
        ArrayList<Integer> list =new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<asteroids.length;i++) {
            if (asteroids[i] > 0) {
                st.push(asteroids[i]);
            } else {
                while (!st.isEmpty() && st.peek() > 0&&st.peek() < Math.abs(asteroids[i])) {
                        st.pop();
                }
                if (!st.isEmpty() && Math.abs(asteroids[i]) == st.peek()) {
                    st.pop();
                }
            }
        }
        while(!st.isEmpty()){
            list.add(st.pop());
        }
        Collections.reverse(list);
        int ans[] = new int[list.size()];
        int l=0;
        for(int num:list){
            ans[l++] = num;
        }
return ans;
    }
}