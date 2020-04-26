package com.jingbao.study.proxy;


public class Test {

    public static void main(String[] args) throws Throwable {
        IHello hello = new Hello();
        CustomHandler customHandler = new CustomHandler(hello);
        IHello helloProxy = (IHello) ProxyFactory.newProxyInstance(hello.getClass().getClassLoader(), IHello.class, customHandler);
//        helloProxy.sayHello("-------------------------");
        System.out.println("a+false+Object=" + helloProxy.sayHello3("a", false, new Object()));


        System.out.println(helloProxy.getClass().getName());
    }

}