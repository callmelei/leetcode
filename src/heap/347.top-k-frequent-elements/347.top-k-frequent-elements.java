/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */

// @lc code=start
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Bucket Sort
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int num : nums)
        // map.put(num, map.getOrDefault(num, 0) + 1);
        // List<Integer>[] bucket = new List[nums.length + 1];
        // for (int key : map.keySet()) {
        // int count = map.get(key);
        // if (bucket[count] == null)
        // bucket[count] = new ArrayList<Integer>();
        // bucket[count].add(key);
        // }
        // List<Integer> list = new ArrayList<>();
        // for (int i = nums.length; i >= 1 && list.size() < k; i--) {
        // if (bucket[i] != null)
        // list.addAll(bucket[i]);
        // }
        // int[] res = new int[list.size()];
        // for (int i = 0; i < list.size(); i++)
        // res[i] = list.get(i);
        // return res;

        // Heap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((e1, e2) -> e2.getValue() - e1.getValue());
        for (Map.Entry entry : map.entrySet())
            pq.offer(entry);
        List<Integer> list = new ArrayList<>();
        while (list.size() < k) {
            list.add(pq.poll().getKey());
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            res[i] = list.get(i);
        return res;
    }
}
// @lc code=end
