import java.util.*;

class topKFrequent {
    public int[] topKFrequent(int[] nums, int k) {

        // Count frequency
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Min heap based on frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> freq.get(a) - freq.get(b)
        );

        for (int num : freq.keySet()) {
            pq.offer(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Store result
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }

        return result;
    }
}