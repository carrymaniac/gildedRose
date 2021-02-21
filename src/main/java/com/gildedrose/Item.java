package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    boolean isEquals(String s) {
        return s.equals(name);
    }

    boolean isAged_brie() {
        return isEquals("Aged Brie");
    }

    boolean isBackstagePasses() {
        return isEquals("Backstage passes to a TAFKAL80ETC concert");
    }

    boolean isSulfuras() {
        return isEquals("Sulfuras, Hand of Ragnaros");
    }

    void updateQualityIfSellInLessThanZero() {
        if (sellIn < 0) {
            if (!isAged_brie()) {
                if (!isBackstagePasses()) {
                    if (quality > 0) {
                        if (!isSulfuras()) {
                            quality = quality - 1;
                        }
                    }
                } else {
                    quality = 0;
                }
            } else {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
        }
    }

    void updateSellIn() {
        if (!isSulfuras()) {
            sellIn = sellIn - 1;
        }
    }

    void updateQualityForItem() {
        if (!isAged_brie() && !isBackstagePasses()) {
            if (quality > 0) {
                if (!isSulfuras()) {
                    quality = quality - 1;
                }
            }
        } else {
            if (quality < 50) {
                quality = quality + 1;

                if (isBackstagePasses()) {
                    if (sellIn < 11) {
                        if (quality < 50) {
                            quality = quality + 1;
                        }
                    }

                    if (sellIn < 6) {
                        if (quality < 50) {
                            quality = quality + 1;
                        }
                    }
                }
            }
        }
    }
}
