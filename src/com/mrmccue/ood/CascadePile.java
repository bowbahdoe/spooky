package com.mrmccue.ood;

import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Immutable
public final class CascadePile implements CardPile {
    @Nonnull
    private final List<Card> cards;

    /**
     * Constructs a cascade pile given some starting cards.
     *
     * @param cards The cards to start with in the CascadePile
     */
    private CascadePile(@Nonnull List<Card> cards) {
        Objects.requireNonNull(cards, "CascadePile: Cards must not be null");
        for (Card card : cards) {
            Objects.requireNonNull(card, "CascadePile: No card in cards may be null");
        }
        this.cards = new ArrayList<>(cards);
    }

    /**
     * Creates a Cascade pile with the given starting cards.
     *
     * @param cards The cards to start with.
     * @return A new Cascade Pile with the cards given as it's contents.
     */
    public static CascadePile withStartingCards(@Nonnull List<Card> cards) {
        return new CascadePile(cards);
    }

    @Override
    public boolean canAdd(@NotNull Card card) {
        if (this.cards.isEmpty()) {
            return true;
        } else {
            Card lastCard = this.cards.get(this.cards.size() - 1);
            return Objects.equals(SuitColor.of(lastCard.getSuit()), SuitColor.of(card.getSuit()));
        }
    }

    @Nonnull
    @Override
    public CardPile add(@NotNull Card card) {
        if (this.canAdd(card)) {
            List<Card> newCards = new ArrayList<>(this.cards);
            newCards.add(card);
            return new CascadePile(
                    newCards
            );
        } else {
            return this;
        }
    }

    @Nonnull
    @Override
    public CardPile remove(int n) {
        try {
            List<Card> newCards = new ArrayList<>(this.cards);
            newCards.remove(n);
            return new CascadePile(
                    newCards
            );
        } catch (IndexOutOfBoundsException e) {
            return this;
        }
    }

    @Nullable
    @Override
    public Card get(int n) {
        try {
            return this.cards.get(n);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    @Override
    public int size() {
        return this.cards.size();
    }

    @Override
    public String toString() {
        return "CascadePile{" +
                "cards=" + cards +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CascadePile that = (CascadePile) o;
        return Objects.equals(cards, that.cards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cards);
    }

    /**
     * Private enum for the "color" of a suit.
     */
    private enum SuitColor {
        RED, BLACK;

        /**
         * Extracts the color from a suit.
         *
         * @param suit The suit to test.
         * @return The color of the suit.
         */
        public static SuitColor of(@Nonnull Suit suit) {
            switch (suit) {
                case CLUBS:
                    return SuitColor.BLACK;
                case SPADES:
                    return SuitColor.BLACK;
                case DIAMONDS:
                    return SuitColor.RED;
                case HEARTS:
                    return SuitColor.RED;
                default:
                    throw new IllegalArgumentException("Unsupported suit type: " + Objects.toString(suit));
            }
        }
    }
}
