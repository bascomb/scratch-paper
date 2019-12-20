package com.bascomb.scratch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 */
public class FunctionsTest {
    Logger logger = LogManager.getLogger(FunctionsTest.class);
    private Collection<Object> collection;

    @Test
    public void countEmptyCollection() {
        collection = new ArrayList<Object>();
        long expected = 0L;
        long count = Functions.count(collection, Integer.class);

        Assertions.assertThat(count).isEqualTo(expected);

        collection.stream().forEach(logger::info);
        logger.info("Expected " + expected);
        logger.info("Functions.count(collection, T) -> " + count);
    }

    @Test
    public void countIntegersInStringCollection() {
        collection = new ArrayList<Object>();
        collection.add(new String("Not an Integer"));
        long expected = 0L;
        long count = Functions.count(collection, Integer.class);

        Assertions.assertThat(count).isEqualTo(expected);

        collection.stream().forEach(logger::info);
        logger.info("Expected " + expected);
        logger.info("Functions.count(collection, T) -> " + count);
    }

    @Test
    public void countMultipleIntegerObjectsInCollection() {
        collection = new ArrayList<Object>();
        collection.add(0);
        collection.add(1);
        long expected = 2L;
        long count = Functions.count(collection, Integer.class);

        Assertions.assertThat(count).isEqualTo(expected);

        collection.stream().forEach(logger::info);
        logger.info("Expected " + expected);
        logger.info("Functions.count(collection, T) -> " + count);
    }
}
