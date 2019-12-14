package com.bascomb.scratch.junit4;

import com.bascomb.scratch.Functions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 *
 */
public class AppTestJunit4
{
    private static final Logger logger = LogManager.getLogger(AppTestJunit4.class.getName());

    String s1 = "S1";
    String s2 = "S2";
    String s3 = "S3";


    @Test
    public void concatStrings() {
        logger.info(Functions.concat(s1,s2,s3));
    }

    @Test
    public void concatStringsWithArray() {
        logger.info(Functions.concat(new String[]{s1, s2, s3}));
    }

    @Test
    public void concatStringsMethodRef() {
        logger.info(Functions.concatImpl2(s1,s2,s3));
    }

}
