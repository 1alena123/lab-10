package com.company;
import java.io.PrintStream;

public class Method3 extends Exception {
    private int detail;

    Method3(int a){
        detail = a;
    }

    public String toString(){
        return "Method3[" + detail + "]";
    }
}

