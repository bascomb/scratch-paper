package com.bascomb.scratch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 *
 */
public class ConcatTestParameterized {

    private static final Logger logger = LogManager.getLogger(ConcatTestParameterized.class.getName());

    //3 x 3 table of strings
    private static final String[] s1 = {"s11", "s12", "s13"};
    private static final String[] s2 = {"s21", "s22", "s23"};
    private static final String[] s3 = {"s31", "s32", "s33"};

    private static final String[] z1 = {"z11", "z12", "z13", "z14"};

    //Print "Bascomb is great"
    @ParameterizedTest
    @CsvSource({"One, Two, Three", "Four, Five, Six"})
    public void printCsv(String first, String second, String third) {
        logger.info(Functions.concat(first, second, third));
        assertNotNull(first);
    }

}
