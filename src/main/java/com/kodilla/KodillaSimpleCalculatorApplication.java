package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class SimpleCalculator {
    public double subtractAFromB(double a, double b) {
        return a - b;
        }
    }
    class Application {
        public static void main(String[] args) {
        SimpleCalculator Calculator = new SimpleCalculator();
        double result = Calculator.subtractAFromB(15.5, 4.5);
    System.out.println(result);
    }
}