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

        Assertions.assertThat(Functions.count(collection, new Integer(1))).isEqualTo(0L);

        collection.stream().forEach(logger::info);
        logger.info("Functions.count(collection, T) -> " + Functions.count(collection, new Integer(1)));
    }

    @Test
    public void countIntegersInStringCollection() {
        collection = new ArrayList<Object>();
        collection.add(new String("Not an Integer"));

        Assertions.assertThat(Functions.count(collection, new Integer(1))).isEqualTo(0L);

        collection.stream().forEach(logger::info);
        logger.info("Functions.count(collection, T) -> " + Functions.count(collection, new Integer(1)));
    }

    @Test
    public void countMultipleIntegerObjectsInCollection() {
        collection = new ArrayList<Object>();
        collection.add(0);
        collection.add(1);

        Assertions.assertThat(Functions.count(collection, new Integer(1))).isEqualTo(collection.size());

        collection.stream().forEach(logger::info);
        logger.info("Functions.count(collection, T) -> " + Functions.count(collection, new Integer(1)));
    }
}
