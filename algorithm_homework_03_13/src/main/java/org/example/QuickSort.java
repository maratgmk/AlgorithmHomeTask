package org.example;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {15, 11, -2, 7, 0, 8, 23, -17, 3, 9};

        System.out.println("Исходный массив: \n" + Arrays.toString(arr));

        quickSortRecursive(arr, 0, arr.length - 1);

        System.out.println("Отсортированный массив в обратном порядке :\n" + Arrays.toString(arr));


    }


    private static void quickSortRecursive(int[] arr, int start, int end) {
        if (start >= end) return;
        int pivot = arr[end];
        int i = start;
        int j = end;
        while (i <= j) {
            while (arr[i] > pivot) i++;
            while (arr[j] < pivot) j--;
            if (i <= j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        quickSortRecursive(arr, start, j);
        quickSortRecursive(arr, i, end);
    }
}
