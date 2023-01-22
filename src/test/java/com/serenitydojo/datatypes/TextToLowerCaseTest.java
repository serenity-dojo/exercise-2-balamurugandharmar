package com.serenitydojo.datatypes;

import com.serenitydojo.TextToLowerCaseConverter;
import org.junit.Assert;
import org.junit.Test;

public class TextToLowerCaseTest {

    @Test
    public void textToLowerCaseTest() {
        Assert.assertEquals("balamurugan", new TextToLowerCaseConverter().getTextInLowerCase("BalaMurugan"));
    }
}
