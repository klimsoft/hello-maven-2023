package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void sampleTest() {
        int result = 2 + 2;
        Assertions.assertEquals(4, result);
    }
}