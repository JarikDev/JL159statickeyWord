package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class StaticInitLesson {
/*    static int i;
    static{
        i=10;
        i=0;
        ++i;
    }
    static { i = 10; }
    static int i = 0;
    static { ++i; }*/


    public static void main(String[] args) {
        new StaticInitLesson();
        System.out.println(i);
    }
    static int i;
    int j;
    static class Student{}
    static interface Car{
        int k=i;
      //  int n=j;
    }
}
