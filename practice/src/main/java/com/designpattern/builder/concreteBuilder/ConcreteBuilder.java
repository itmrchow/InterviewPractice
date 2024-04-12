package com.designpattern.builder.concreteBuilder;

import com.designpattern.builder.builder.Builder;
import com.designpattern.builder.product.Product;

public class ConcreteBuilder implements Builder {

    private Product product = new Product();

    @Override
    public void buildPart1(String part1) {
        product.setPart1(part1);
    }

    @Override
    public void buildPart2(String part2) {
        product.setPart2(part2);
    }

    @Override
    public Product getResult() {
        return product;
    }

}
