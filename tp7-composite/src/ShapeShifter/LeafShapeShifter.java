package ShapeShifter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeafShapeShifter implements IShapeShifter {
    private int value;

    public LeafShapeShifter(int value) {
        this.value = value;
    }

    @Override
    public IShapeShifter compose(IShapeShifter s) {
        List<IShapeShifter> children = new ArrayList<>();
        children.add(this);
        children.add(s);
        return new CompositeShapeShifter(children);
    }

    @Override
    public int deepest() {
        return 0;
    }

    @Override
    public IShapeShifter flat() {
        return this;
    }

    @Override
    public List<Integer> values() {
        return Collections.singletonList(value);
    }
}
