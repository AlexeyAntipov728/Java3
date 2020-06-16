package lesson6;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Test2 {
    @Test
    public void arrayWithOtherFigures() {
        assertTrue("Массив имеет другие цифры", Task2.checkArray(new int[]{4, 4, 1, 1, 4, 1, 4, 1}));
    }

    @Test(expected = RuntimeException.class)
    public void arrayWith1and4() {
        Assert.assertFalse("В массиве только 1 и 4", Task2.checkArray(new int[]{6, 4, 3}));
    }

    @Test
    public void arrayWith_1() {
        Assert.assertFalse("Есть 1 в массиве", Task2.checkArray(new int[]{17, 6, 4, 7, 9}));
    }

    @Test
    public void arrayWith_4() {
        Assert.assertFalse("Есть 4 в массиве", Task2.checkArray(new int[]{10, 15, 33, 8, 14}));
    }
}
