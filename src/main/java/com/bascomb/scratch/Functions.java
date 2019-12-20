package com.bascomb.scratch;

import java.util.Arrays;
import java.util.Collection;

/**
 *
 */
public class Functions {

    //Concat the given strings using Java 8
    public static String concat(String...strings) {
        return Arrays.asList(strings).stream().reduce("", (a,b) -> a + b);
    }

    //Concat the given strings using Java 8 with method reference
    public static String concatImpl2(String...strings) {
        return Arrays.asList(strings).stream().reduce("", String::concat);
    }

    //Write a generic method to count the number of elements in a collection that have a specific property (for example, odd integers, prime numbers, palindromes).
    public static <T> long count(Collection<?> collection, T property) {
        return collection.stream().filter(item -> item.getClass().equals(property)).count();
    }

}
