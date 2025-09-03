package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        float result;

        if (operation.equals("+")) {
            result = a + b;
        } else if (operation.equals("-")) {
            result = a - b;
        } else if (operation.equals("*")) {
            result = a * b;
        } else if (operation.equals("/")) {
            result =  (float) a / b;
        } else {
           throw new IllegalArgumentException("Wrong operation sign");
        }

        return result;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        float result = calculate(-25, 5, "/");
        System.out.println(result);
        */
    }

}
