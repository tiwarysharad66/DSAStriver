package slidingwndow;

import java.util.HashMap;

public class SubarraysWithKdifferentIntegers {
    public static void main(String[] args) {
int nums[] = {1,2,1,2,3};
int k = 2;
        System.out.println(subarraysWithKDistinct(nums,k));
    }

    public static int subarraysWithKDistinct(int[] nums, int k) {
        int c1 = subarraysatmostKdistinct(nums, k);
        int c2 = subarrays2(nums, k - 1);
        return c1-c2;
    }

    public static int subarraysatmostKdistinct(int nums[], int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        int size = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        while (j < size) {
            mp.put(nums[j], mp.getOrDefault(nums[j], 0) + 1);
            if (mp.size() > k) {
                while (mp.size() > k) {
                    mp.put(nums[i], mp.get(nums[i]) - 1);
                    if (mp.get(nums[i]) == 0) {
                        mp.remove(nums[i]);
                    }
                    i++;
                }
            }
            count = count + j - i + 1;
            j++;
        }
        return count;
    }

    public static int subarrays2(int nums[], int k) {
        int i = 0;
        int j = 0;
        int count = 0;

        int size = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        while (j < size&&k>=0) {
            mp.put(nums[j], mp.getOrDefault(nums[j], 0) + 1);
            if (mp.size() > k) {
                while (mp.size() > k) {
                    mp.put(nums[i], mp.get(nums[i]) - 1);
                    if (mp.get(nums[i]) == 0) {
                        mp.remove(nums[i]);
                    }
                    i++;
                }
            }
            count = count + j - i + 1;
            j++;
        }
        return count;
    }
}
