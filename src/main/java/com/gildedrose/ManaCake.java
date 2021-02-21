package com.gildedrose;

public class ManaCake extends Item {
    public ManaCake(int sellIn, int quality) {
        super("Conjured Mana Cake", sellIn, quality);
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