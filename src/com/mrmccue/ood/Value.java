package com.mrmccue.ood;

import java.util.Objects;

public enum Value {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    private final int numericValue;

    Value(int numericValue) {
        this.numericValue = numericValue;
    }

    public int numeric() {
        return this.numericValue;
    }

    public String toString() {
        switch (this) {
            case ACE:
                return "A";
            case TWO:
            case THREE:
            case FOUR:
            case FIVE:
            case SIX:
            case SEVEN:
            case EIGHT:
            case NINE:
            case TEN:
                return Objects.toString(this.numericValue);
            case JACK:
                return "J";
            case QUEEN:
                return "Q";
            case KING:
                return "K";
            default:
                return super.toString();
        }
    }
}
