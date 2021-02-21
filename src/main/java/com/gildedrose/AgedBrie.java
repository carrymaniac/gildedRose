package com.gildedrose;

public class AgedBrie extends Item {

    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    void updateQualityForItem() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    @Override
    void updateSellIn() {
        sellIn = sellIn - 1;
    }

    @Override
    void updateQualityIfSellInLessThanZero() {
        if (sellIn < 0 && quality < 50) {
            quality = quality + 1;
        }
    }
}

