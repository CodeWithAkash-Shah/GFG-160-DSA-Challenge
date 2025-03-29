package day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElementII {

    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        // 1 : sort the array
        Arrays.sort(nums);
        // 2 : loop and check weather the current element streak > onthird && it should
        // not
        // less the currelement+1 -> if yes put it inside list
        int len = nums.length;
        int OneThird = len / 3;
        int currentStreak = 1;
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < len; i++) {
            if (nums[i] == nums[i - 1]) {
                currentStreak++;
            } else {
                if (currentStreak > OneThird) {
                    res.add(nums[i - 1]);
                }
                currentStreak = 1;
            }
        }
        if (currentStreak > OneThird) {
            res.add(nums[len - 1]);
        }
        return res;
        
        // HashMap<Integer,Integer> map = new HashMap<>();
        // int len = nums.length;
        // int OneThird = len/3;
        // for(int i : nums){
        // map.put(i,map.getOrDefault(i,0)+1);
        // }

        // //Collect elements that appear more than len/3 times
        // List<Integer> result = new ArrayList<>();
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        // if(entry.getValue()>OneThird){
        // result.add(entry.getKey());
        // }
        // }
        // return result;
    }
}