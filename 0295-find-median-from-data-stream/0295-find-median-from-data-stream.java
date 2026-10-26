class MedianFinder {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap =new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {
    }

    public void addNum(int num) {

        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }

        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        }

        if (minHeap.size() > maxHeap.size() + 1) {
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian() {

        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        }

        if (minHeap.size() > maxHeap.size()) {
            return minHeap.peek();
        }

        return ((double) maxHeap.peek() + minHeap.peek()) / 2.0;
    }
}
