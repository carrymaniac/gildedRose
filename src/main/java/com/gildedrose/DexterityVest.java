package com.gildedrose;

public class DexterityVest extends Item {
    public DexterityVest(int sellIn, int quality) {
        super("+5 Dexterity Vest", sellIn, quality);
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
