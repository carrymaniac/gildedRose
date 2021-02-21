package com.gildedrose;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TexttestFixture {
    public static void main(String[] args) throws IOException {
        doGildedRoseUpdateQuality(args);
    }

    public static String doGildedRoseUpdateQuality(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(byteArrayOutputStream);
        out.println("OMGHAI!");

        Item[] items = new Item[]{
                new DexterityVest(10, 20), //
                new AgedBrie(2, 0), //
                new Mongoose(5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new BackstagePasses(15, 20),
                new BackstagePasses(10, 49),
                new BackstagePasses(5, 49),
                // this conjured item does not work properly yet
                new ManaCake(3, 6)};

        GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            out.println("-------- day " + i + " --------");
            out.println("name, sellIn, quality");
            for (Item item : items) {
                out.println(item);
            }
            out.println();
            app.updateQuality();
        }
        return byteArrayOutputStream.toString(StandardCharsets.UTF_8);
    }


}
