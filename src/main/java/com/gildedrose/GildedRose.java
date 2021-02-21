package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            updateQualityForItem(item);
            updateSellIn(item);
            updateQualityIfSellInLessThanZero(item);
        }
    }

    private void updateQualityIfSellInLessThanZero(Item item) {
        if (item.sellIn < 0) {
            if (!item.isAged_brie()) {
                if (!item.isBackstagePasses()) {
                    if (item.quality > 0) {
                        if (!item.isSulfuras()) {
                            item.quality = item.quality - 1;
                        }
                    }
                } else {
                    item.quality = 0;
                }
            } else {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }
        }
    }

    private void updateSellIn(Item item) {
        if (!item.isSulfuras()) {
            item.sellIn = item.sellIn - 1;
        }
    }

    private void updateQualityForItem(Item item) {
        if (!item.isAged_brie() && !item.isBackstagePasses()) {
            if (item.quality > 0) {
                if (!item.isSulfuras()) {
                    item.quality = item.quality - 1;
                }
            }
        } else {
            if (item.quality < 50) {
                item.quality = item.quality + 1;

                if (item.isBackstagePasses()) {
                    if (item.sellIn < 11) {
                        if (item.quality < 50) {
                            item.quality = item.quality + 1;
                        }
                    }

                    if (item.sellIn < 6) {
                        if (item.quality < 50) {
                            item.quality = item.quality + 1;
                        }
                    }
                }
            }
        }
    }

}