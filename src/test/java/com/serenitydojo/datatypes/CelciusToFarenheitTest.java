package com.serenitydojo.datatypes;

import com.serenitydojo.CelciusToFarenheitConverter;
import org.junit.Assert;
import org.junit.Test;

public class CelciusToFarenheitTest {

    @Test
    public void celciusToFarenheitTest() {
        Assert.assertEquals(32, new CelciusToFarenheitConverter().getFarenheitValue(0), 0);
        Assert.assertEquals(96.8, new CelciusToFarenheitConverter().getFarenheitValue(36), 0);
        Assert.assertEquals(-95.8, new CelciusToFarenheitConverter().getFarenheitValue(-71), 0);
    }
}
