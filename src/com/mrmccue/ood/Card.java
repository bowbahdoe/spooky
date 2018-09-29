package com.mrmccue.ood;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;
import java.util.Objects;

/**
 * Value Class to represent a Card with suit and a printed value.
 */
@Immutable
public final class Card {
    @Nonnull
    private final Suit suit;
    @Nonnull
    private final Value value;
    /**
     * Makes a new Card with the given suit and value.
     *
     * @param suit  The suit of the new Card.
     * @param value The value of the new Card.
     */
    public Card(@Nonnull Suit suit, @Nonnull Value value) {
        Objects.requireNonNull(suit, "suit must not be null");
        Objects.requireNonNull(value, "value must not be null");

        this.suit = suit;
        this.value = value;
    }

    /**
     * Gets the suit of the card.
     *
     * @return The suit of the card.
     */
    @Nonnull
    public Suit getSuit() {
        return this.suit;
    }

    /**
     * Gets the value of the card.
     *
     * @return The value of the card.
     */
    @Nonnull
    public Value getValue() {
        return this.value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit == card.suit &&
                value == card.value;
    }

    @Override
    public String toString() {
        return value.toString() + suit.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, value);
    }
}
