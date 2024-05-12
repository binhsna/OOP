package Generic;

class GenericExercise1 {
    public static void main(String[] args) {
        Group<Integer> group_int = new Group<>(Integer.class, 100);
        group_int.addItem(1);
        group_int.addItem(5);
        System.out.println(group_int.getItem(0) + group_int.getItem(1));

        Group<String> group_str = new Group<>(String.class, 100);
        group_str.addItem("VietNam");
        System.out.println(group_str.getItem(0));
    }
}

class Group<T> {

    T items[];// mảng lưu các phần tử trong nhóm
    int num;// số phần tử hiện tại trong nhóm

    public Group(Class<T> dataType, int length) {
        this.items = (T[]) java.lang.reflect.Array.newInstance(dataType, length);
        num = 0;
    }

    public void addItem(T item) {
        items[num] = item;
        num++;
    }

    public T getItem(int index) {
        if (index >= 0 && index < num) {
            return items[index];
        } else {
            return null;
        }
    }

    public int getNumberItems() {
        return num;
    }
}
