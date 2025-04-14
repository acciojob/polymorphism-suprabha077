package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class TestCases {

    public  void product(int x, int y) {
        System.out.println(x * y);
    }

    public  void product(int x, int y, int z) {
        System.out.println(x * y * z);
    }

    public  void product(double x, double y) {
        System.out.println(x * y);
    }
}
