package com.jingbao.study.chain;


import java.util.List;

@Enable
public class PriorityStrategy extends Strategy {


    @Override
    public List<Target>  proxy(List<Target> list){
        System.out.println("PriorityStrategy");
        return null;
    }


}
