package com.gildedrose;

public class BackstagePasses extends Item {

    public BackstagePasses(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    void updateQualityForItem() {
        if (quality < 50) {
            quality = quality + 1;
            if (sellIn < 11 && quality < 50) {
                quality = quality + 1;
            }
            if (sellIn < 6 && quality < 50) {
                quality = quality + 1;
            }
        }
    }

    @Override
    void updateSellIn() {
        sellIn = sellIn - 1;
    }

    @Override
    void updateQualityIfSellInLessThanZero() {
        if (sellIn < 0) {
            quality = 0;
        }
    }
}