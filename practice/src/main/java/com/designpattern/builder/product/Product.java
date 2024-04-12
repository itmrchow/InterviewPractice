package com.designpattern.builder.product;

public class Product {
    private String part1;
    private String part2;

    /**
     * @param part1 the part1 to set
     */
    public void setPart1(String part1) {
        this.part1 = part1;
    }

    /**
     * @param part2 the part2 to set
     */
    public void setPart2(String part2) {
        this.part2 = part2;
    }

    @Override
    public String toString() {
        return "par1:" + part1 + ",part2:" + part2;
    }

}
