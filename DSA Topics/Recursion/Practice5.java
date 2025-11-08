public class Practice5 {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
        int target = 7;
        System.out.println(searchRotatedArr(arr, 1, 0, arr.length - 1));
    }

    static int searchRotatedArr(int arr[], int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return searchRotatedArr(arr, target, s, m - 1);
            } else {
                return searchRotatedArr(arr, target, m + 1, e);
            }
        }
        if (target >= arr[m] && target <= arr[e]) {
            return searchRotatedArr(arr, target, m + 1, e);
        }
        return searchRotatedArr(arr, target, s, m - 1);
    }
}