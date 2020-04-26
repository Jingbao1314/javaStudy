package com.jingbao.study.chain;

import java.util.List;

@Enable
public class QuantityStrategy extends Strategy {


    @Override
    public List<Target> proxy(List<Target> list)
    {
        System.out.println("QuantityStrategy");
        return null;
    }

}
