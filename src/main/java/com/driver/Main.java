package com.driver;

public class Main {


 public static void main(String[] args) {
        // Task 2: Create object of Product in Main function called p
        Product p = new Product();

        // Call the method with two int parameters
        int result1 = p.product(4, 5);
        System.out.println("Product of 4 and 5: " + result1); // Output: 20

        // Call the overloaded method with three int parameters
        int result2 = p.product(2, 3, 4);
        System.out.println("Product of 2, 3, and 4: " + result2); // Output: 24

        // Call the overloaded method with two double parameters
        double result3 = p.product(2.5, 3.5);
        System.out.println("Product of 2.5 and 3.5: " + result3); // Output: 8.75
    }
}

}
