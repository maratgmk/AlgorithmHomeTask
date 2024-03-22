package org.example;
/*
2. Написать проверку числа "простое" ли оно, используя итерационный подход. (не рекурсия)

 */
public class Main {
    public static void main(String[] args) {
        int number = 11;
        int count = 0;
        for (int i = 1; i <= number ; i++) {
            if(number % i == 0){
                count++;
            }
        }
        if(count == 2) System.out.println(number + " prime number");
    }
}