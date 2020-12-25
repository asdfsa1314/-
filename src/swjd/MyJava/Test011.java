package swjd.MyJava;

//import java.util.SplittableRandom;

import java.util.Objects;
import java.util.Scanner;

public class Test011 {
int a;
int b;
String c;

    public int getA() {

        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test011 test011 = (Test011) o;
        return a == test011.a && b == test011.b && Objects.equals(c, test011.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    public Test011(int a, int b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {


    }
}
