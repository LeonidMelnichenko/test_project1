package src.lessons130223;

public class MainHolder {

    public static void main(String[] args) {
        String testString = "Test";
        Holder<String>stringHolder = new Holder<>(testString);

        Holder<Integer> integerHolder = new Holder<>(25);
        stringHolder.setValue(testString);
        String str = stringHolder.getValue();

        integerHolder.setValue(15);
        Integer i = integerHolder.getValue();
    }
}
