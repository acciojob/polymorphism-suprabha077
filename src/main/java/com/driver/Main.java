package com.driver;

public class Main {

    static class Product {

        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }
    public static void main(String[] args) {
        Product p = new Product();


        // Calling all product methods
        System.out.println(p.product(4, 5));
        System.out.println( p.product(2, 3, 4));
        System.out.println(p.product(2.5, 3.5));
    }
}


