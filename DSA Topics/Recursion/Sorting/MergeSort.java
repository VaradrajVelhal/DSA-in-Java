import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int arr[]) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int left[] = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] l, int[] r) {
        int mix[] = new int[l.length + r.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < l.length && j < r.length) {
            if (l[i] < r[j]) {
                mix[k] = l[i];
                i++;
            } else {
                mix[k] = r[j];
                j++;
            }
            k++;
        }
        while (i < l.length) {
            mix[k] = l[i];
            i++;
            k++;
        }
        while (j < r.length) {
            mix[k] = r[j];
            j++;
            k++;
        }
        return mix;
    }
}
