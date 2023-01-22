package com.serenitydojo.datatypes;

import com.serenitydojo.KgToPoundConverter;
import org.junit.Assert;
import org.junit.Test;

public class KgToPoundTest {

    @Test
    public void kiloGramToPundTest() {
        Assert.assertEquals(2.2, new KgToPoundConverter().getPoundValue(1), 0);
        Assert.assertEquals(11.0, new KgToPoundConverter().getPoundValue(5), 0);
        Assert.assertEquals(0.0, new KgToPoundConverter().getPoundValue(-10), 0);
    }
}
