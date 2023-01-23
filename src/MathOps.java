import java.util.Random;

public class MathOps {
    public static void main (String []arg ) {
        Random rand = new Random();
        int i, j, k;
        // выбор значения от 1 до 100
        j = rand.nextInt (100) + 1;
        System.out.println("j: " + j);
        k = rand.nextInt(100) + 1;
        System.out.println("k: " + k);
        i = j+k;
        System.out.println("j+k: " + i);
        i = j-k;
        System.out.println("j-k: " + i);
        i = k/j;
        System.out.println("k/j: " + i);
        i = k*j;
        System.out.println("k*j: " + i);
        i = k%j;
        System.out.println("k%j: " + i);
        //тесты для вещественых чисел
        float u, v, w;
        v = rand.nextFloat();
        System.out.println("v: " + v);
        w = rand.nextFloat();
        System.out.println("w: " + w);
        u = v + w;
        System.out.println("v+w: " + u);
        u = v - w;
        System.out.println("v-w: " + u);
        u = v * w;
        System.out.println("v*w: " + u);
        u = v / w;
        System.out.println("v/w: " + u);
        u += v;
        System.out.println("u+=v: " + u);
        u -= v;
        System.out.println("u-=v: " + u);
        u *= v;
        System.out.println("u*=v: " + u);
        u /= v;
        System.out.println("u/=v: " + u);
    }
}
