package Bai2;

class Person {
    String name;
    int age;
    String address;
    static int count = 0;

    public static int getCount() {
        count++;
        return count;
    }

    Person() {
    }

    Person(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String address) {
        this(name, age);
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void display() {
        System.out.println("_Name: " + name + "  _Age: " + age + "    _Address: " + address);
    }
}
