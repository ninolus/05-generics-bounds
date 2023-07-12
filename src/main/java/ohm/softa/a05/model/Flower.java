package ohm.softa.a05.model;

public class Flower extends Plant{
    public Flower(PlantColor color) {
        if (color == PlantColor.GREEN) {
            throw new RuntimeException("Plant cannot be green!");
        }
        this.color = color;
    }
}
