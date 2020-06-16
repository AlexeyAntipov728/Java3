package lesson6;

import java.util.Arrays;

public class Task1 {
    public static int[] newArr(int[] startArr) {
        int[] newArr = null;

        for (int i = 0; i < startArr.length; i++) {
            if (startArr[i] == 4) {
                newArr = new int[startArr.length - i - 1];
                for (int j = i + 1, b = 0; j < startArr.length; j++, b++) {
                    if (startArr[j] == 4) continue;
                    newArr[b] = startArr[j];
                }
            }
        }
        if (newArr == null) {
            throw new RuntimeException("В массиве нет цифры 4 ");
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] arr2 = {0, 2, 17, 35, 21, 4, 8};
        int[] arr3 = {4, 4, 1, 1, 4, 1, 4, 1};
        int[] arr4 = {2, 33, 0, 11, 70};

        newArr(arr1);
        System.out.println(Arrays.toString(newArr(arr1)));
        newArr(arr2);
        System.out.println(Arrays.toString(newArr(arr2)));
        newArr(arr3);
        System.out.println(Arrays.toString(newArr(arr3)));
        newArr(arr4);
        System.out.println(Arrays.toString(newArr(arr4)));

    }
}

