package Generic;

class GenericExercise2 {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(10, "Binh");
        System.out.println(pair.getKey() + " | " + pair.getValue());
        IntPair<Float> intpair = new IntPair<>(10, 10.0f);
        System.out.println(intpair.getKey() + " | " + intpair.getValue());
    }
}

class Pair<K, V> {
    K k;
    V v;
    
    public Pair(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getKey() {
        return k;
    }

    public V getValue() {
        return v;
    }
}

class IntPair<V> extends Pair<Integer, V> {
    public IntPair(Integer k, V v) {
        super(k, v);
    }
}

