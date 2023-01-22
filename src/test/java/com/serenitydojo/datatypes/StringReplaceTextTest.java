package com.serenitydojo.datatypes;

import com.serenitydojo.StringTextReplacer;
import org.junit.Assert;
import org.junit.Test;

public class StringReplaceTextTest {

    @Test
    public void stringReplaceTextTest() {
        Assert.assertEquals("Balamurugan", new StringTextReplacer().getReplacedString("Bala", "", "murugan"));
        Assert.assertEquals("Balamurugan", new StringTextReplacer().getReplacedString("Bala d", " d", "murugan"));
        Assert.assertEquals("Balamurugan", new StringTextReplacer().getReplacedString("Balamurugan", "", ""));
        Assert.assertEquals("murugan", new StringTextReplacer().getReplacedString("Balamurugan", "Bala", ""));
        Assert.assertEquals("Balamurugan", new StringTextReplacer().getReplacedString("Balamurugan", "Bala", null));
    }
}
