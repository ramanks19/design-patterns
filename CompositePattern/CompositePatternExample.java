public class CompositePatternExample {

    public static void main(String[] args) {
        //Create individual shapes
        Graphic circle = new Circle();
        Graphic rectangle = new Rectangle();

        //Create a composite shape and add individual shapes to it
        CompositeGraphic composite = new CompositeGraphic();
        composite.add(circle);
        composite.add(rectangle);

        //Draw the composite shape, which includes individual shapes
        composite.draw();
    }
    
}
