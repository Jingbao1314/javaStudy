package com.jingbao.study.chain;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Target extends Strategy
{
}
