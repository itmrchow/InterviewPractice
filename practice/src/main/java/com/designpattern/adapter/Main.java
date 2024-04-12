package com.designpattern.adapter;

public class Main {
    public static void main(String[] args) {
        var hole = new RoundHole(5);

        var roundPeg = new RoundPeg(5);
        var squarePeg = new SquarePeg(5);

        hole.fits(roundPeg);
        // hole.fits(squarePeg); //不能直接用

        var squarePegAdapter = new SquarePegAdapter(squarePeg);
        hole.fits(squarePegAdapter);// 經過配適可以用
    }
}
