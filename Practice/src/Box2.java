public class Box2<T extends Number> {

    T t;

    public Box2(T t) {
        this.t = t;
    }

    public T get(){
        return t;
    }

    public static void main(String[] args) {
        Box2<Integer> bx1 = new Box2<>(10);
        System.out.println(bx1.t);

        Box2<Double> bx2= new Box2<>(12.23);
        System.out.println(bx2.t);
    }
}
