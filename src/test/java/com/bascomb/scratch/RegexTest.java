package com.bascomb.scratch;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 */
public class RegexTest {

    @Test
    public void matchEquals() {
        boolean expected = true;
        String regex = "regex";
        String input = "regex";
        assertThat(regex).isEqualTo(input);
        assertThat(Regex.matchEquals(regex, input)).isTrue();
    }

    @Test
    public void matchDynamicOrg() {
        String regex = "TEST_.*";
        String input = "TEST_1";

        assertThat(regex).isNotEqualTo(input);
    }
}
