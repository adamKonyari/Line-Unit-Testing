package com.codecool.line;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    private Line lineTester1;
    private Line lineTester2;
    private Line lineTester3;


    @BeforeEach
    void setUp() {
        lineTester1 = new Line(1.5, 1.9, 2.4, 5.6);
        lineTester2 = new Line(1.5, 1.9, 1.5, 5.6);
        lineTester3 = new Line(1.5, 1.9, 1.5, 5.6);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getSlope() {
        assertEquals((lineTester1.getY1() - lineTester1.getY0()) / (lineTester1.getX1() - lineTester1.getX0()), lineTester1.getSlope(), 0001);
    }

    @Test
    void getDistance() {
        assertEquals(Math.sqrt((lineTester1.getX1() - lineTester1.getX0()) * (lineTester1.getX1() - lineTester1.getX0()) + (lineTester1.getY1() - lineTester1.getY0()) * (lineTester1.getY1() - lineTester1.getY0())), lineTester1.getDistance(), 0001);
    }

    @Test
    void parallelTo() {

    }
}
