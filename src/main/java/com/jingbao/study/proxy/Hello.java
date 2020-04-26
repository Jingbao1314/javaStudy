package com.jingbao.study.proxy;

public class Hello implements IHello {
    @Override
    public int sayHello3(String a, boolean b, Object c) {
        String abc = a + b + c;
//        System.out.println("a + b + c=" + abc);

        sayHello("-------------------"+a+"-------------------");
        System.out.println(this.getClass().getName());
        return abc.hashCode();
    }

    @Override
    public void sayHello(String a) {
        System.out.println(a);
    }
}
