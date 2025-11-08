//array sorted or not using recursion
public class Practice2 {
    public static void main(String[] args) {
        int arr[] = { 10, 23, 30, 39, 56, 100, 101 };
        boolean ans = isSorted(arr, 0);
        System.out.println(ans);
    }

    static boolean flag = true;

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }
}
