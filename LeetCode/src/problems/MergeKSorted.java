package problems;

import java.util.PriorityQueue;

public class MergeKSorted {
    public void mergeKSorted(int[][] arr) {
        PriorityQueue<ArrayContainer> pq = new PriorityQueue();
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            pq.add(new ArrayContainer(arr[i], 0));
            total += arr[i].length;
        }

        int result[] = new int[total];
        int index = 0;

        while(!pq.isEmpty()) {
            ArrayContainer ac = pq.poll();
            result[index++] = ac.arr[ac.index];

            if(ac.index < ac.arr.length - 1) {
                pq.add(new ArrayContainer(ac.arr, ac.index + 1));
            }
        }
    }

    class ArrayContainer implements Comparable<ArrayContainer> {
        int[] arr;
        int index;

        public ArrayContainer(int[] arr, int index) {
            this.arr = arr;
            this.index = index;
        }

        @Override
        public int compareTo(ArrayContainer o) {
            return this.arr[this.index] - o.arr[o.index];
        }
    }
}
