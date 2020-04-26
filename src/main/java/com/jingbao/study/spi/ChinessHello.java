package com.jingbao.study.spi;

public class ChinessHello implements Hello{
    @Override
    public void sayHello() {
        System.out.println("ChinessHello");
    }
}
