package src.lesson150223;

import java.util.Objects;

public class Box123 implements Comparable<Box123> {
    public Box123(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    private final int x;
    private final int y;

    private final int z;

    public int volume (){
        return  x*y*z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box123 box123 = (Box123) o;
        return x == box123.x && y == box123.y && z == box123.z;
    }


    @Override
    public int compareTo(Box123 o) {
        return Integer.compare(this.volume(), o.volume());
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        return "Box{" +
                "x=" + x +
                " , y=" + y +
                " , z=" + z +
                '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}

