class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int i : nums) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Count> pq = new PriorityQueue<>(new Comparator<Count>() {
            @Override
            public int compare(Count a, Count b) {
                return Integer.compare(b.frequency, a.frequency);
            }
        });
        for (Map.Entry<Integer, Integer> e : mp.entrySet()) {
            pq.offer(new Count(e.getKey(), e.getValue()));
        }
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll().data;
        }
        return result;
    }

    class Count {
        int data;
        int frequency;
        Count(int data, int frequency){
            this.data=data;
            this.frequency=frequency;
        }
    }
}
