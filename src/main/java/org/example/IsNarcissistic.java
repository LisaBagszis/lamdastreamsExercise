package org.example;

public class IsNarcissistic {

    public static void main(String[] args) {


        int n = 153;
        System.out.println(isNarcissistic(n));
    }

    public static boolean isNarcissistic(int n) {
        int digits = String.valueOf(n).length(); // Anzahl der Ziffern ermitteln
        int sum = 0;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return (sum == n);
    }
}





