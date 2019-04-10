package com.company;
import java.io.PrintStream;

public class Method2 {
    void start3(int a) {
        System.out.println("3-Разнотипные исключения");
        try {
            switch (a) {
                case 1:
                    throw new NullPointerException();
                case 2:
                    throw new NoSuchFieldException();
                case 3:
                    throw new ArrayIndexOutOfBoundsException();
            }
        }
        catch (ArrayIndexOutOfBoundsException | NoSuchFieldException | NullPointerException e) {
            System.out.println("исключение: " + e);
        }
    }
}