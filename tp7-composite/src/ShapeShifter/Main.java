package ShapeShifter;

public class Main {
    public static void main(String[] args) {
        IShapeShifter a = new LeafShapeShifter(1);  // profundidad 0
        IShapeShifter b = new LeafShapeShifter(2);
        IShapeShifter c = a.compose(b); // profundidad 1

        System.out.println("a.deepest(): " + a.deepest()); // 0
        System.out.println("c.deepest(): " + c.deepest()); // 1
        System.out.println("c.values(): " + c.values());   // [1, 2]
        System.out.println("c.flat().values(): " + c.flat().values()); // [1, 2]
    }
}
