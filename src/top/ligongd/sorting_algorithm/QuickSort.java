/**
 * @Author tanyacheng
 * @Date 2022/2/26 9:24
 * @Version 1.0
 */
package top.ligongd.sorting_algorithm;

public class QuickSort {
    int[] input = new int[]{1,3,25,2,7,19,4,3,15,22};

    public static void main(String[] args) {
        int[] input = new int[]{1,3,25,2,7,19,4,3,15,22};
        quickSort(input,0, input.length-1);
        for(int x : input){
            System.out.println(x);
        }

    }

    public static void quickSort(int[] in, int start, int end){
        if(start < end){
            int pivotpos = partition(in, start, end);
            quickSort(in, start, pivotpos-1);
            quickSort(in, pivotpos+1, end);
        }
    }
    public static int partition(int[] in, int i, int j){
        // 左边小于，右边大于等于
        int sentry = in[i];

//        int j = end;
//        int i = start+1;
//        int n = in.length;
        while(i < j){
            while((i<j) && (in[j] >= sentry)){
                j--;

            }
            in[i] = in[j];
            while((i<j) && (in[i] <= sentry)){
                i++;

            }
            in[j] = in[i];

        }
        in[i] = sentry;
        return i;
    }
}
