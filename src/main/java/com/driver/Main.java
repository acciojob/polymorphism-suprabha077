package com.driver;

public class Main {


  public static void main(String[] args) {
        // Task 2: Create object of Product
        TestCases p = new TestCases();

        // Call all product methods
        System.out.println("Product of 4 and 5: " + p.product(4, 5));            // int x, int y
        System.out.println("Product of 2, 3 and 4: " + p.product(2, 3, 4));     // int x, int y, int z
        System.out.println("Product of 2.5 and 3.5: " + p.product(2.5, 3.5));   // double x, double y
    }
}

}
