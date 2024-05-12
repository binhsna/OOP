package th3;


public class TH3Run2 {
    public static void main(String[] args) {
//        Series series = new Series(10);
//        series.set(0, 1);
//        series.set(1, "Binh");
//        series.set(2, new Cat());
//        ((Cat)series.get(2)).run(); // Ép kiểu Object cho Cat
//        for (int i = 0; i < series.size; i++) {
//            System.out.println(series.get(i));
//        }

        //Series<Integer> s1 = new Series<>(4);
        FloatSeries series = new FloatSeries(2);
        series.set(0, 2.5f);
        series.set(1, 8.4f);
        //series.get(1);
        System.out.println("Sum: " + series.getSum());
    }
}

class Series<T> {

    T objs[];// Nhận bất kỳ giá tri truyền vào nào (float, String,...)
    int size;

    public Series(int size) {
        this.size = size;
        //objs = new T[size];// Giới hạn của kiểu generic: Không thể khởi tạo mảng
        objs = (T[]) new Object[size]; // mẹo ép kiểu
    }

    public T get(int index) {
        return objs[index];
    }

    public void set(int index, T obj) {
        objs[index] = obj;
    }
}

class FloatSeries extends Series<Float> {

    public FloatSeries(int size) {
        super(size);
    }

    //    public Float getSum() {
//        Float sum = 0f;
//        for (Float f : objs) {
//            sum += f;
//        }
//        return sum;
//    }
    public Float getSum() {
        Float sum = 0f;
        for (int i = 0; i < size; i++) {
            sum += get(i);
        }
        return sum;
    }
}

