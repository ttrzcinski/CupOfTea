package com.ttrzcinski;

public final class Application {
    
    public static void main(String[] arg) {

        new CupOfTea()
            .builder()
            .withCup(new Cup(false))
            .withBag(new Bag("zielona"))
            .withLiquid(new Liquid(Color.BLACK))
            .build();
    }
}
