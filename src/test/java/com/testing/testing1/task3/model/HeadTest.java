package com.testing.testing1.task3.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeadTest {


    private Head head;
    private Head.Hair hair;

    @BeforeEach
    void setUp() {
        head = new Head("бесплотная");
        hair = new Head.Hair();
    }

    @Test
    void headDescriptionTest() {
        assertEquals("бесплотная", head.getDescription());
    }

    @Test
    void hairMoveTest() {
        hair.toMove();
        assertEquals("зашевелились волосы", hair.getCurrentAction());
    }

}
