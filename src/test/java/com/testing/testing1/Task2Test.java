package com.testing.testing1;

import com.testing.testing1.task2.SelectionSorter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task2Test {

    @Test
    void unsortedArrayTest() {
        int [] arr = {2, 5, 10, 4, 7, 88, 10, 0};
        int [] expected = {0, 2, 4, 5, 7, 10, 10, 88};
        assertArrayEquals(expected, SelectionSorter.sort(arr));
    }

    @Test
    void equalArrayElementsTest() {
        int [] arr = {0, 0, 0, 0, 0};
        int [] expected = {0, 0, 0, 0, 0};
        assertArrayEquals(expected, SelectionSorter.sort(arr));
    }

    @Test
    void sortedArrayTest() {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(expected, SelectionSorter.sort(arr));
    }

    @Test
    void negativeElementsArrayTest() {
        int [] arr = {-2, -5, 10, 4, -7, -88, 10, 0};
        int [] expected = {-88, -7, -5, -2, 0, 4, 10, 10};
        assertArrayEquals(expected, SelectionSorter.sort(arr));
    }

    @Test
    void twoElementsTest() {
        int [] arr = {13, 9};
        int [] expected = {9, 13};
        assertArrayEquals(expected, SelectionSorter.sort(arr));
    }

    @Test
    void oneElementTest() {
        int [] arr = {7};
        int [] expected = {7};
        assertArrayEquals(expected, SelectionSorter.sort(arr));
    }

    @Test
    void emptyArrayTest() {
        int [] arr = {};
        int [] expected = {};
        assertArrayEquals(expected, SelectionSorter.sort(arr));
    }

}
