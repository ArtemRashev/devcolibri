package com.devcolibri.task;

import java.util.Comparator;

public final class Sorts {
    public static <E> void bubbleSort(E[] array, Comparator<E> comparator) {
        E temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (comparator.compare(array[j], array[j + 1]) > 0) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
