package com.jingbao.study.chain;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

public class  Plugin implements InvocationHandler {
    private Object target;
    private Object proxyObject;

    public Plugin(Object target, Object proxyObject) {
        this.target = target;
        this.proxyObject = proxyObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getName().equals("filter")){
            Object res=method.invoke(target,args);
            res=((Strategy)proxyObject).proxy((List<Target>) res);
            return res;
        }else {
            return method.invoke(target,args);
        }
    }

    public static Object wrap(Object target, Interceptor interceptor) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new Plugin(target,interceptor));
    }
}

