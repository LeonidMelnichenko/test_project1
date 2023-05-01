package src.lessons130223;

public class PairClassical<K, V> {
    public PairClassical(K left, V right) {
        this.left = left;
        this.right = right;
    }

    private final K left;
    private final V right;

    public static <T, T1> PairClassical<T, T1> of(T left, T1 right) {
        return new PairClassical<>(left, right);
    }

    public static void main(String[] args) {
        PairClassical<String, Integer> pair = PairClassical.of("String", 12);
    }
}