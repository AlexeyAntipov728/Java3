package lesson6;

public class Task2 {
    public static boolean checkArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 4 && arr[i] != 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] arr2 = {0, 2, 17, 35, 21, 3, 8};
        int[] arr3 = {2, 33, 41, 11, 70};
        int[] arr4 = {4, 4, 1, 1, 4, 1, 4, 1};

        checkArray(arr1);
        checkArray(arr2);
        checkArray(arr3);
        checkArray(arr4);
    }
}
