class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> res = new PriorityQueue<>(
            (a,b) -> b - a
        );
        for ( int stone : stones){
            res.add(stone);
        }

        while (res.size() > 1){
            int max1 = res.poll();
            int max2 = res.poll();

            if (max1 != max2){
            res.add(max1-max2);
            }
        }
        return res.isEmpty() ? 0 : res.poll();
    }
}
