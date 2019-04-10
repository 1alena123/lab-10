package com.company;
import java.io.PrintStream;
public class Method1 {
    void start(){
        System.out.println("1-Деление на ноль");

try {
    int d = 0;
    int s = 150 / d;
}
catch (ArithmeticException e){
            System.out.println("исключение: " + e);
}
 }
 void start1(){
     System.out.println("2-Выход за пределы массива");
     try {
         int mas[] = {11,22,33,44,55};
         System.out.println(mas[7]);
     }
     catch (ArrayIndexOutOfBoundsException e){
         System.out.println("исключение: " + e);
     }
 }


}

