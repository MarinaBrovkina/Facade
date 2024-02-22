package org.example;

public class BinOps {

    public String sum(String a, String b) {
        int numberFirst = Integer.parseInt(a, 2);
        int numberSecond = Integer.parseInt(b, 2);
        int calc = numberFirst + numberSecond;
        return Integer.toBinaryString(calc);
    }

    public String mult(String a, String b) {
        int numberFirst = Integer.parseInt(a, 2);
        int numberSecond = Integer.parseInt(b, 2);
        int calc = numberFirst * numberSecond;
        return Integer.toBinaryString(calc);
    }
}
