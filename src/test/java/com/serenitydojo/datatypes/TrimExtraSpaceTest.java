package com.serenitydojo.datatypes;

import com.serenitydojo.ExtraSpaceTrimmer;
import org.junit.Assert;
import org.junit.Test;

public class TrimExtraSpaceTest {

    @Test
    public void trimExtraSpaceTest() {
        Assert.assertEquals("Balamurugan", new ExtraSpaceTrimmer().trimExtraSpace(" Balamurugan "));
        Assert.assertEquals("Bala murugan", new ExtraSpaceTrimmer().trimExtraSpace(" Bala murugan "));
    }
}
