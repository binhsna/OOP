package th3;


public class TH3Run3 {
    public static void main(String[] args) {
        MammalBox<cat> catbox = new MammalBox<>();
        catbox.setValue(new cat());
        catbox.getValue().say();

        MammalBox<Dog3> dogbox = new MammalBox<>();
        dogbox.setValue(new Dog3());
        dogbox.getValue().say();

        MammalBox1<Mammal> a = new MammalBox1<>();
        a.setValue(new Mammal());
        a.getValue().run();
    }
}


class Mammal {

    public Mammal() {
    }

    public void run() {

        System.out.println("Mammal run");
    }
}

interface MammalActivity {

    void say();
}

class cat extends Mammal implements MammalActivity {
    @Override
    public void say() {
        System.out.println("Meo");
    }
}

class Dog3 extends Mammal implements MammalActivity {

    @Override
    public void say() {
        System.out.println("Go");
    }

}

// box chỉ chứa Mammal : chỉ chứa Cat hoặc Dog
class MammalBox<T extends Mammal & MammalActivity> {

    T value;

    public void setValue(T v) {

        this.value = v;
    }

    public T getValue() {
        return this.value;
    }
}

class MammalBox1<T extends Mammal> {

    T value;

    public void setValue(T v) {

        this.value = v;
    }

    public T getValue() {
        return this.value;
    }
}



