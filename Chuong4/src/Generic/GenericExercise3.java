package Generic;

class GenericExercise3 {
    public static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        // Tham so kieu Integer
        Box<Integer> box = new Box<>();
        box.setValue(1);
        System.out.println(box.getValue());

        // Tham so kieu Cat
//        DoubleBox<Integer, Cat> dbCat = new DoubleBox<>();
//        dbCat.setValue(1, new Cat());
//        dbCat.getValue2().say();
        SplitBox<Integer, Cat> splitBox = new SplitBox<>();
        splitBox.setValue(1, new Cat());
        splitBox.getValue1().say();

        Integer a = 1; // khác int a=1
        Integer b = 1;
//        System.out.println(MainClass.<Integer>isEqual(a, b));
        System.out.println(isEqual(a, b));
    }

}

// 1 tham so
class Box<T> {
    T value;

    public void setValue(T v) {

        this.value = v;
    }

    public T getValue() {
        return this.value;
    }
}

class Cat {
    public void say() {
        System.out.println("Meow");
    }
}

// Giảm bớt tham số kiểu
class CatBox extends Box<Cat> {
}

// Tăng thêm tham số kiểu
class SplitBox<E, T> extends Box<T> {
    E value2;

    public void setValue(E e, T v) {
        this.value = v;
        this.value2 = e;
    }

    public T getValue1() {
        return this.value;
    }

    public E getValue2() {
        return this.value2;
    }
}
