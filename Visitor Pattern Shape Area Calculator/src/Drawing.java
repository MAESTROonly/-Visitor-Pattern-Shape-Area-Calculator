import java.util.ArrayList;
import java.util.List;

public class Drawing {
    private final List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void calculateAreas() {
        AreaCalculator areaCalculator = new AreaCalculator();
        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
        }
        System.out.printf("Total area: %.2f\n", areaCalculator.getTotalArea());
    }
}
