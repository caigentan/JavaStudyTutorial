/**
 * @Author tanyacheng
 * @Date 2022/2/19 23:48
 * @Version 1.0
 */
package top.ligongd.demos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.goodTriplets(new int[]{2,0,1,3},new int[]{0,1,2,3});
    }
    public long goodTriplets(int[] nums1, int[] nums2) {
        List<int[]> resNums1 = getArrays(nums1);
        List<int[]> resNums2 = getArrays(nums2);
        Map<Integer, ArrayList<int[]>> nums2Map = new HashMap<>();
        long res = 0;
        for(int[] nums: resNums1){
            resNums2 = nums2Map.get(nums[0]+nums[1]+nums[2]);

            if(resNums2 != null){
                System.out.println(resNums2);
                for(int[] tnums: resNums2){
                    if(tnums[0] == nums[0] && tnums[1] == nums[1] && tnums[2] == nums[2]){
                        res++;
                        break;
                    }
                }
            }
        }
        return res;

    }

    public List<int[]> getArrays(int[] nums){
        List<int[]> resNums = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    resNums.add(new int[]{nums[i],nums[j],nums[k]});
                }
            }
        }
        return resNums;
    }

    public Map<Integer, ArrayList<int[]>> getMap(int[] nums){
        Map<Integer, ArrayList<int[]>> numsMap = new HashMap<>();
        List<int[]> resNums = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int tempSum = nums[i]+nums[j]+nums[k];
                    ArrayList<int[]> out = new ArrayList<>();
                    out = numsMap.getOrDefault(tempSum, new ArrayList<>());
                    out.add(new int[]{nums[i],nums[j],nums[k]});
                    numsMap.put(tempSum, out);
                    // numsMap.get(new int[]{nums[i],nums[j],nums[k]})
                    // resNums.add(new int[]{nums[i],nums[j],nums[k]});
                }
            }
        }
        return numsMap;
    }
}