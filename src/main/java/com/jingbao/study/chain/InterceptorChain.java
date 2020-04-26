package com.jingbao.study.chain;


import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class InterceptorChain {
    private final static List<Interceptor> interceptors = new ArrayList<>();

    public static Object pluginAll(Object target) {
        for (Interceptor interceptor : interceptors) {
            target = interceptor.plugin(target);
        }
        return target;
    }


    static {
        //入参 要扫描的包名
        Reflections f = new Reflections("com.megvii.zoom");
        //入参 目标注解类
        Set<Class<?>> set = f.getTypesAnnotatedWith(Enable.class);
        for (Class e:set) {
            Class c=e;
            try {
                Object object=c.newInstance();
                interceptors.add((Interceptor) object);

            } catch (InstantiationException e1) {
                e1.printStackTrace();
            } catch (IllegalAccessException e1) {
                e1.printStackTrace();
            }
        }
    }

}
