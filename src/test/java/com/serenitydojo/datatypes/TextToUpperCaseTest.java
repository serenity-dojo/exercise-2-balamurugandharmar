package com.serenitydojo.datatypes;

import com.serenitydojo.TextToUpperCaseConverter;
import org.junit.Assert;
import org.junit.Test;

public class TextToUpperCaseTest {

    @Test
    public void textToLowerCaseTest() {
        Assert.assertEquals("BALAMURUGAN", new TextToUpperCaseConverter().getTextInUpperCase("BalaMurugan"));
    }
}
