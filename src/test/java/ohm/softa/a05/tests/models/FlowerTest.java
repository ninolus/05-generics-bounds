package ohm.softa.a05.tests.models;

import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.PlantColor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlowerTest {

    @BeforeEach
    void setup() {

    }

    @Test
    void testGreenFlowerShouldThrowException() {
        Exception exception = assertThrows(Exception.class, () -> {
            Flower objectUnderTest = new Flower(1, "family", "name", PlantColor.GREEN);
        });

        String expectedMessage = "Flowers cannot be green!";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void testEqualFlowersShouldBeEqual() throws Exception {
        Flower equal = new Flower(1, "family", "name", PlantColor.RED);
        Flower objectUnderTest = new Flower(1, "family", "name", PlantColor.RED);

        assertTrue(objectUnderTest.equals(equal));
    }

    @Test
    void testEqualFlowersShouldCompareToZero() throws Exception {
        Flower equal = new Flower(1, "family", "name", PlantColor.RED);
        Flower objectUnderTest = new Flower(1, "family", "name", PlantColor.RED);

        int actual = objectUnderTest.compareTo(equal);

        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void testSmallerFlowersShouldCompareToNegative() throws Exception {
        Flower equal = new Flower(5, "family", "name", PlantColor.RED);
        Flower objectUnderTest = new Flower(1, "family", "name", PlantColor.RED);

        int actual = objectUnderTest.compareTo(equal);

        int expected = -1;
        assertEquals(actual, expected);
    }

    @Test
    void testBiggerFlowersShouldCompareToPositive() throws Exception {
        Flower equal = new Flower(1, "family", "name", PlantColor.RED);
        Flower objectUnderTest = new Flower(5, "family", "name", PlantColor.RED);

        int actual = objectUnderTest.compareTo(equal);


        int expected = 1;
        assertEquals(actual, expected);;
    }

}
