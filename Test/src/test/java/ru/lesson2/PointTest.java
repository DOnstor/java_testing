package ru.lesson2;


import org.lesson1.Point;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {
    @Test
    public void testDistance() {
        Point p = new Point();
        p.x1 = 10;
        p.x2 = -3;
        p.y1 = 22;
        p.y2 = 1;
        Assert.assertEquals(p.distance2(), 24.698178070456937);
    }


}
