package com.github.hcsp.objectbasic;

public class Main {
    public static void main(String[] args) {
        // 现在被选中的方法是print(int)，请强制令其选中方法print(Number i)
        print(new Number() {
            @Override
            public int intValue() {
                return 1;
            }

            @Override
            public long longValue() {
                return 1;
            }

            @Override
            public float floatValue() {
                return 1;
            }

            @Override
            public double doubleValue() {
                return 1;
            }
        });
    }

    public static void print(int i) {
        System.out.println("I'm int!");
    }

    public static void print(Integer i) {
        System.out.println("I'm Integer!");
    }

    public static void print(Number i) {
        System.out.println("I'm Number!");
    }

    public static void print(Object i) {
        System.out.println("I'm Object!");
    }
}
