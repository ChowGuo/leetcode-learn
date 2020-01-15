package com.first.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 */
public class TwoSum {
    /**
     * 一次 hash 遍历,
     * @param nums 源数组
     * @param target 目标值
     * @return 结果下标
     */
    public int[] twoSum(int[] nums, int target) {
        // 初始化 hashMap 大小，增加处理效率 （魔鬼在细节）
        Map<Integer, Integer> map = new HashMap<Integer, Integer>((int)(nums.length / 0.75F + 1));
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("Now two sum value");
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int [] nums = new int[] {1, 2, 3, 4 ,5 ,6, 7, 8, 9, 42};
        int [] res = twoSum.twoSum(nums, 17);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
