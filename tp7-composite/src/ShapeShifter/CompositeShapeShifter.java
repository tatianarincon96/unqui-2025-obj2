package ShapeShifter;

import java.util.ArrayList;
import java.util.List;

public class CompositeShapeShifter implements IShapeShifter {
    private List<IShapeShifter> children;

    public CompositeShapeShifter(List<IShapeShifter> children) {
        this.children = children;
    }

    @Override
    public IShapeShifter compose(IShapeShifter s) {
        List<IShapeShifter> newChildren = new ArrayList<>(this.children);
        newChildren.add(s);
        return new CompositeShapeShifter(newChildren);
    }

    @Override
    public int deepest() {
        int maxDepth = 0;
        for (IShapeShifter child : children) {
            maxDepth = Math.max(maxDepth, child.deepest());
        }
        return maxDepth + 1;
    }

    @Override
    public IShapeShifter flat() {
        List<IShapeShifter> flattened = new ArrayList<>();
        for (IShapeShifter child : children) {
            for (Integer v : child.values()) {
                flattened.add(new LeafShapeShifter(v));
            }
        }
        return new CompositeShapeShifter(flattened);
    }

    @Override
    public List<Integer> values() {
        List<Integer> vals = new ArrayList<>();
        for (IShapeShifter child : children) {
            vals.addAll(child.values());
        }
        return vals;
    }
}
