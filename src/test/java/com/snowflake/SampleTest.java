package com.snowflake;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SampleTest {
    @Test
    void sampleTest() {
        Sample sample = new Sample();

        assertThat(sample).isNotNull();
    }
}