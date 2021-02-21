package com.gildedrose;


import com.google.common.io.Files;
import org.junit.jupiter.api.Test;


import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RefactorTestForGildedRose {

    @Test
    void baseLineTest() throws IOException {
        final String baseLine = Files.asCharSource(new File("./gilded-rose-kata.txt"), StandardCharsets.UTF_8).read();
        final String s = TexttestFixture.doGildedRoseUpdateQuality(new String[]{});
        assertEquals(baseLine,s);
    }
}
