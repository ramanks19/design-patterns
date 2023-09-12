//Composite Class

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic{
    private List<Graphic> children = new ArrayList<>();

    public void add(Graphic graphic) {
        children.add(graphic);
    }

    @Override
    public void draw() {
        for (Graphic graphic : children) {
            graphic.draw();
        }
    }
}
