package com.designpattern.builder.director;

import com.designpattern.builder.builder.Builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPart1("Part1");
        builder.buildPart2("Part2");
    }

}
