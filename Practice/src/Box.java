public class Box<T> {

    private T t;

    public Box(T t) {
        this.t = t;
    }

    public T get(){
        return t;
    }

    public static void main(String[] args){
        Box<Integer> box1 = new Box<>(10);
        Box<String> box2 = new Box<>("ram");

//        box1.add(10);
//        box2.add("ram");

        System.out.println(box1.get());
        System.out.println(box2.get());
    }


}
