package org.example;

public class Main {

    public static void main(String[] args) {
        BinOps bins = new BinOps();
        String sum = bins.sum("0", "1");
        System.out.println(sum);
        String mult = bins.mult("0", "1");
        System.out.println(mult);
    }
}
