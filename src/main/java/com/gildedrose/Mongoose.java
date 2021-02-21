package com.gildedrose;

public class Mongoose extends Item {
    public Mongoose(int sellIn, int quality) {
        super("Elixir of the Mongoose", sellIn, quality);
    }


    @Override
    void updateQualityForItem() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    @Override
    void updateSellIn() {
        sellIn = sellIn - 1;
    }

    @Override
    void updateQualityIfSellInLessThanZero() {
        if (sellIn < 0 && quality > 0) {
            quality = quality - 1;
        }
    }
}
