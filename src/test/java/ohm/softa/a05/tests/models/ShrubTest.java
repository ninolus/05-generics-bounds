package ohm.softa.a05.tests.models;

import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.PlantColor;
import ohm.softa.a05.model.Shrub;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShrubTest {

    @Test
    void testEqualShrubsShouldBeEqual() {
        Shrub equal = new Shrub(1, "family", "name");
        Shrub objectUnderTest = new Shrub(1, "family", "name");

        assertTrue(objectUnderTest.equals(equal));
    }

    @Test
    void testEqualShrubsShouldCompareToZero() throws Exception {
        Shrub equal = new Shrub(1, "family", "name");
        Shrub objectUnderTest = new Shrub(1, "family", "name");

        int actual = objectUnderTest.compareTo(equal);

        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void testSmallerShrubShouldCompareToNegative() throws Exception {
        Shrub equal = new Shrub(5, "family", "name");
        Shrub objectUnderTest = new Shrub(1, "family", "name");

        int actual = objectUnderTest.compareTo(equal);

        int expected = -1;
        assertEquals(actual, expected);
    }

    @Test
    void testBiggerShrubShouldCompareToPositive() throws Exception {
        Shrub equal = new Shrub(1, "family", "name");
        Shrub objectUnderTest = new Shrub(5, "family", "name");

        int actual = objectUnderTest.compareTo(equal);


        int expected = 1;
        assertEquals(actual, expected);;
    }
}
