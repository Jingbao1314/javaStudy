package com.jingbao.study;

import com.jingbao.study.spi.Hello;

import java.util.ServiceLoader;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args )
    {
        ServiceLoader<Hello> serviceLoader = ServiceLoader.load(Hello.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Hello::sayHello);
        System.out.println( "Hello World!" );
    }

}
