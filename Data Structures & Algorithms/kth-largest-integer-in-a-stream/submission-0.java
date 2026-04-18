class KthLargest {
private PriorityQueue<Integer> minheap;
private int k;
    public KthLargest(int k, int[] nums) {
        minheap = new PriorityQueue<>();
        this.k = k;
    for (int num : nums){
        add(num);
    }
        
    }
    
    public int add(int val) {
        minheap.offer(val);
        if (minheap.size() > k){
            minheap.poll();
        }
        return minheap.peek();
    }
}
