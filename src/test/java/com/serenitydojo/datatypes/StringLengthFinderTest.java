package com.serenitydojo.datatypes;

import com.serenitydojo.StringLengthFinder;
import org.junit.Assert;
import org.junit.Test;

public class StringLengthFinderTest {

    @Test
    public void stringLengthFinderTest() {
        Assert.assertEquals(11, new StringLengthFinder().getStringLength("Balamurugan"));
        Assert.assertEquals(0, new StringLengthFinder().getStringLength(""));
        Assert.assertNull(new StringLengthFinder().getStringLength(null));
    }
}
