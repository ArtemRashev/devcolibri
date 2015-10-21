package com.devcolibri.task;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class Book {
    public final String name;
    public final String authorName;
    public final Date publishDate;

    public Book(String name, String authorName, Date publishDate) {
        this.name = name;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
        return "Book{" +
                "name='" + name + '\'' +
                ", author=\'" + authorName + '\'' +
                ", publishing date=\'" + format.format(publishDate) + '\'' +
                '}';
    }

    static class Comparators {
        public static Comparator<Book> getComplexComparator() {
            return (b1, b2) -> {
                int result = b1.publishDate.compareTo(b2.publishDate);
                if (result == 0) {
                    result = b1.authorName.compareTo(b2.authorName);
                }
                if (result == 0) {
                    result = b1.name.compareTo(b2.name);
                }
                return result;
            };
        }

        public static Comparator<Book> getSimpleComparator() {
            return (b1, b2) -> b1.publishDate.compareTo(b2.publishDate);
        }
    }
}
