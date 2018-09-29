package com.mrmccue.ood;


import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Immutable
public final class FoundationPile implements CardPile {
    private final Suit suit;
    private final List<Card> cards;

    private FoundationPile(@Nonnull Suit suit,
                           @Nonnull List<Card> cards) {
        Objects.requireNonNull(suit, "FoundationPile: suit must not be null");
        Objects.requireNonNull(cards, "FoundationPile: cards must not be null");
        cards.forEach(card ->
            Objects.requireNonNull(card, "FoundationPile: No card in cards may be null")
        );
        this.suit = suit;
        this.cards = new ArrayList<>(cards);
    }

    /**
     * Creates a FoundationPile that accepts only cards of the given suit.
     *
     * @param suit The Suit for the pile.
     * @return The newly created FoundationPile.
     */
    public static FoundationPile withSuit(@Nonnull Suit suit) {
        return new FoundationPile(suit, Collections.emptyList());
    }

    @Override
    public boolean canAdd(@Nonnull Card card) {
        if (card == null) {
            return false;
        } else if (this.cards.isEmpty()) {
            return Objects.equals(card.getSuit(), this.suit)
                    && Objects.equals(card.getValue(), Value.ACE);
        } else {
            return Objects.equals(card.getSuit(), this.suit)
                    && card.getValue().numeric() == this.cards.get(0).getValue().numeric() + 1;
        }
    }

    @Nonnull
    @Override
    public CardPile add(@Nonnull Card card) {
        if (this.canAdd(card)) {
            List<Card> newCards = new ArrayList<>();
            newCards.add(card);
            newCards.addAll(this.cards);
            return new FoundationPile(
                    this.suit,
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
            return new FoundationPile(
                    this.suit,
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
        return "FoundationPile{" +
                "suit=" + suit +
                ", cards=" + cards +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoundationPile that = (FoundationPile) o;
        return suit == that.suit &&
                Objects.equals(cards, that.cards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, cards);
    }
}
