package ohm.softa.a05.tests.models;

import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.PlantColor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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



}
