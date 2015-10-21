package com.devcolibri.task;

import java.util.Date;
import java.util.GregorianCalendar;

import static com.devcolibri.task.Book.Comparators.getComplexComparator;

public class Test {
    public static void main(String[] args) {

        Book[] books = {new Book("A", "Frank", defineDate(2999, 11, 5)),
                new Book("B", "Eugen", defineDate(2011, 1, 9)),
                new Book("B", "Eugen", defineDate(2011, 1, 9)),
                new Book("C", "David", defineDate(2011, 1, 9)),
                new Book("D", "Chloe", defineDate(2011, 1, 9)),
                new Book("E", "Brian", defineDate(2001, 3, 11)),
                new Book("F", "Aaron", defineDate(2010, 5, 27))};


        System.out.println("Unsorted sample: ");
        for (Book book : books) {
            System.out.println(book);
        }

        Sorts.bubbleSort(books, getComplexComparator());

        System.out.println("\nSorted sample: ");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static Date defineDate(int year, int month, int day) {
        return new GregorianCalendar(year, month, day).getTime();
    }
}
