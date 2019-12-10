package com.bascomb.scratch;

import java.util.Arrays;

/**
 *
 */
public class Example {

    //Concat the given strings using Java 8
    public String concatString(String...strings) {
        return Arrays.asList(strings).stream().reduce("", (a,b) -> a + b);
    }

    //Concat the given strings using Java 8
    public String concatStringMethodRef(String...strings) {
        return Arrays.asList(strings).stream().reduce("", String::concat);
    }

}
