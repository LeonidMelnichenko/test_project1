package src.headFirst.one;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"технологичный", "дом", "австралия", "метод"};
        String[] wordListTwo = {"мне", "нужно", "поменять", "масло", "в машине"};
        String[] wordListThree = {"я", "люблю", "свою", "семью"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListTwo[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Все, что вам нужно знать - это " + phrase);
    }
}
