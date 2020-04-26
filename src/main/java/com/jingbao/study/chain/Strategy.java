package com.jingbao.study.chain;



import java.util.List;

public abstract class Strategy implements Interceptor{
    public List<Target> proxy(List<Target> list){
        System.out.println("Strategy");
        return null;
    }

    @Override
    public Object plugin(Object object) {
        return Plugin.wrap(object, this);
    }
}
