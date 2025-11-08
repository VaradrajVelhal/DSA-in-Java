// find the element in array using recursion
public class Practice3 {
    public static void main(String[] args) {
        int arr[] = { 12, 32, 13, 332, 231, 213 };
        int target = 1;
        System.out.println(findEle(arr, target, 0));
    }

    static int findEle(int arr[], int t, int i) {
        if (arr[i] == t) {
            return i;
        }
        if (t != arr[i] && i == arr.length - 1) {
            return -1;
        }

        return findEle(arr, t, i + 1);
    }
}
