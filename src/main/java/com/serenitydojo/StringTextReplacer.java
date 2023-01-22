package com.serenitydojo;

public class StringTextReplacer {

    public String getReplacedString(String text, String textToBeReplaced, String textToReplace) {
        if (textToBeReplaced == null) {
            return text;
        } else if(textToBeReplaced.isEmpty()) {
            return text + textToReplace;
        }

        if (textToReplace == null) {
            return text;
        }
        return text.replace(textToBeReplaced, textToReplace);
    }
}
