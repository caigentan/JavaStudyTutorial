package top.ligongd.structure;

/**
 * 堆分成大顶堆和小顶堆，区分的规则在于其父节点是比子节点大还是比子节点小
 * 从上到下的索引值逐渐增大，所以为保证顶端结点为最值，应当从底向上建堆，也就是采用索引从大到小
 * 注：在只给一个关键词集合的情况下，建堆的结果是不唯一的，
 */
public class HeapSample {
    public static void main(String[] args) {
        int[] heapList = new int[]{1,5,23,54,66,22,33,34,54,65};
        int n = heapList.length;
        int start = n / 2 - 1;
        /**
         * 索引i从0开始时，需要和第2*i+1和2*i+2比较，将大的赋值为当前的结点
         * 堆可以看作是一个二叉树，在二叉树中，结点的度要么是0(叶子节点)，要么是2，其中叶子节点数=度为2结点数+1
         * 所以我们从最左边的叶子节点出发，逐渐向上建堆。
         */

        /**
         * 1,5,23,54,66,22,33
         * 1 5 33 54 66 22 23
         * 1 66 33 54 5 22 23
         * 66 1 33 54 5 22 23
         */
        for(int j=0;j< start;j++) {
            for (int i = start; i >= 0; i--) {
                int maxPos = i;
                if ((2 * i + 1 < n) && (heapList[i] < heapList[2 * i + 1]))
                    maxPos = 2 * i + 1;
                if (2 * i + 2 < n && heapList[maxPos] < heapList[2 * i + 2])
                    maxPos = 2 * i + 2;
                int temp = heapList[i];
                heapList[i] = heapList[maxPos];
                heapList[maxPos] = temp;
            }
        }
        for (int k : heapList){
            System.out.print(k + " ");
        }
    }

}
