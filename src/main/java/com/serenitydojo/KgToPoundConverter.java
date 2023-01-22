package com.serenitydojo;

public class KgToPoundConverter {

    public double getPoundValue(double kiloGram) {
        if (kiloGram < 0) {
            return 0.0;
        }
        return kiloGram * 2.2;
    }
}
