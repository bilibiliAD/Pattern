package com.bilibiliad.singleton1;

/**
 * 单例模式 【Singleton Pattern
 */
public class Emperor {
    private static Emperor emperor = null;

    private Emperor() {

    }

    public static Emperor getInstance() {
        if (emperor == null) {
            emperor = new Emperor();
        }
        return emperor;
    }

    public static void emperorInfo(){
        System.out.println("i'm emperor,my name is ****");
    }
}
