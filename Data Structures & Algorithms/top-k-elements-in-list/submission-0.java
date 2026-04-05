class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i =0; i < nums.length; i++){
            int n = nums[i];
            if (!count.containsKey(n)){
                count.put(n, 1);
            }
            else {
                count.replace(n, count.get(n), count.get(n)+1);
            }
        }
        Queue<Integer> q = new PriorityQueue<>(
            (a,b) -> count.get(b) - count.get(a)
        );
        for ( int key : count.keySet()){
            q.add(key);
        }
        int a = 0;
        int[] arr = new int[k];
        while (!q.isEmpty() && a < k){
            arr[a] = q.poll();
            a++;
        }
        return arr;
         
            
        
    }
}
