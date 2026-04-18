class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> result = new PriorityQueue<>(
            (a,b) -> b - a
        );
        for (int n : nums){
            result.add(n);
        }
        int i =0;
        while (i < k-1){
            result.poll();
            i++;
        }
        return result.peek();
    }
}
