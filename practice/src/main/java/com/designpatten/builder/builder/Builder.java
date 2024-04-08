package com.designpatten.builder.builder;

import com.designpatten.builder.product.Product;

public interface Builder {
    void buildPart1(String part1);

    void buildPart2(String part2);

    Product getResult();

}
