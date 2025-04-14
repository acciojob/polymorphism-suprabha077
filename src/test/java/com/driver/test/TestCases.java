package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

 public class Main {

    // Task 1: Create a class Product inside Main class
    static class Product {

        // Task 3: Method with two int parameters
        public int product(int x, int y) {
            return x * y; // Returns the product of x and y
        }

        // Task 4: Overloaded method with three int parameters
        public int product(int x, int y, int z) {
            return x * y * z; // Returns the product of x, y, and z
        }

        // Task 5: Overloaded method with two double parameters
        public double product(double x, double y) {
            return x * y; // Returns the product of x and y
        }
    }
