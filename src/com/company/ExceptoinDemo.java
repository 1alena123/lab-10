package com.company;

public class ExceptoinDemo{
    static void start3(int a) throws Method3{
        System.out.println("4 - исключение собственного класса");
        System.out.println("Названипе метода start3(" + a + ")");
        if(a>10)
            throw new Method3(a);
        System.out.println("Нормальное завершение");
    }
}