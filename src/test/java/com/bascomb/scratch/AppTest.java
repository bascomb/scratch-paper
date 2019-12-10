package com.bascomb.scratch;

import org.apache.logging.log4j.Level;
import org.junit.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 *
 */
public class AppTest 
{
    private static final Logger logger = LogManager.getLogger(AppTest.class.getName());

    String s1 = "S1";
    String s2 = "S2";
    String s3 = "S3";

    Example example = new Example();

    @Test
    public void concatStrings() {
        logger.log(Level.ALL, "Test");
        logger.info(example.concatString(s1,s2,s3));
    }

    @Test
    public void concatStringsMethodRef() {
        System.out.println(example.concatStringMethodRef(s1,s2,s3));
    }
}
