package generic;

public class Pair<T, U, V> {
    private T first;
    private U second;
    private V three;

    public V getThree() {
        return three;
    }

    public void setThree(V three) {
        this.three = three;
    }

    public Pair(T first, U second, V three) {
        this.first = first;
        this.second = second;
        this.three = three;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public static void main(String[] args) {
        Pair<String, Integer, String> pair = new Pair<>("one", 1,"tiga");

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair.getThree());
    }
}
