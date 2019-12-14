package com.bascomb.scratch;

import java.util.Arrays;

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

}
