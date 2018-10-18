package com.wqf.hellojni;

public class HelloWorld{

    static {
        //名字必须和libjni.so 名字对应起来
        System.loadLibrary("jni");
    }

    public static native String helloWorld();
    public static native int add(int a,int b);

}
