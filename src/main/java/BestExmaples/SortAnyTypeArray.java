package BestExmaples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Stas on 27.03.2019.
 */
public class SortAnyTypeArray {
    private static <E extends Comparable<E>> void swap(List<E> sequence,
                                                       int positionOne, int positionTwo) {
        E temp = sequence.get(positionOne);
        sequence.set(positionOne, sequence.get(positionTwo));
        sequence.set(positionTwo, temp);
    }

    private static <E extends Comparable<E>> void swap(E[] sequence,
                                                       int positionOne, int positionTwo) {
        E temp = sequence[positionOne];
        sequence[positionOne] = sequence[positionTwo];
        sequence[positionTwo] = temp;
    }

    public static <E extends Comparable<E>> List<E> selectionSort(List<E> sequence) {
        for (int i = 0; i < sequence.size(); i++) {
            int minPosition = -1;
            E minValue = sequence.get(i);
            for (int j = i + 1; j < sequence.size(); j++) {
                E secondPosition = sequence.get(j);
                if (minValue.compareTo(secondPosition) > 0) {
                    minPosition = j;
                    minValue = sequence.get(j);
                }
            }
            if (minPosition >= 0) {
                swap(sequence, i, minPosition);
            }
        }
        return sequence;
    }

    public static <E extends Comparable<E>> E[] selectionSort(E[] sequence) {
        for (int i = 0; i < sequence.length; i++) {
            int minPosition = -1;
            E minValue = sequence[i];
            for (int j = i + 1; j < sequence.length; j++) {
                E secondPosition = sequence[j];
                if (minValue.compareTo(secondPosition) > 0) {
                    minPosition = j;
                    minValue = sequence[j];
                }
            }
            if (minPosition >= 0) {
                swap(sequence, i, minPosition);
            }
        }
        return sequence;
    }
    public static void main(String[] args) {

        Integer[] integers = {1, 6, 88, 7, 44, 3, 11};
        System.out.println("Before: " + Arrays.toString(integers));
        SortAnyTypeArray.selectionSort(integers);
        System.out.println("Later: " + Arrays.toString(integers));
        String[] strings = {"carrot","peace","apple","tomato","grapes"};
        System.out.println("Before: " + Arrays.toString(strings));
        SortAnyTypeArray.selectionSort(strings);
        System.out.println("Later: " + Arrays.toString(strings));

    }

}
