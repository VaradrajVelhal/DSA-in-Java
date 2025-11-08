// find the target element and return the list containg index.

import java.util.ArrayList;

public class Practice4 {
    public static void main(String[] args) {
        int arr[] = { 12, 32, 12, 32, 21, 21, 34, 21, 21, 232, 12 };
        int target = 12;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(targetIndex(arr, target, 0, list));
        System.out.println(findAllIndex(arr, target, 0));

    }

    static ArrayList<Integer> targetIndex(int arr[], int target, int i, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        return targetIndex(arr, target, i + 1, list);
    }

    // without taking list as parameter
    static ArrayList<Integer> findAllIndex(int arr[], int target, int i) {
        ArrayList<Integer> list = new ArrayList<>();
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr, target, i + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
