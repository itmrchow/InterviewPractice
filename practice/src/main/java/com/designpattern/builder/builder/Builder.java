package com.designpattern.builder.builder;

import com.designpattern.builder.product.Product;

public interface Builder {
    void buildPart1(String part1);

    void buildPart2(String part2);

    Product getResult();

}
