package com.mrmccue.ood;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
import java.util.Objects;

/**
 * Value class representing an OpenPile in Freecell
 */
@Immutable
public final class OpenPile implements CardPile {
    @Nullable
    private final Card card;

    private OpenPile(@Nullable Card card) {
        this.card = card;
    }

    /**
     * Creates an empty version of an OpenPile.
     *
     * @return The new Pile.
     */
    @Nonnull
    public static OpenPile empty() {
        return new OpenPile(null);
    }

    /**
     * Creates an OpenPile containing the given card.
     *
     * @param card The card for the pile to start with.
     * @return The new Pile.
     */
    @Nonnull
    public static OpenPile withCard(@Nonnull Card card) {
        Objects.requireNonNull(card, "OpenPile.withCard: card must not be null");
        return new OpenPile(card);
    }

    @Override
    public boolean canAdd(@Nonnull Card card) {
        return this.card == null;
    }

    @Nonnull
    @Override
    public CardPile add(@Nonnull Card card) {
        Objects.requireNonNull(card, "CardPile.add: card must not be null");
        if (this.canAdd(card)) {
            return new OpenPile(card);
        } else {
            return this;
        }
    }

    @Nonnull
    @Override
    public CardPile remove(int n) {
        if (n == 0 && this.card != null) {
            return new OpenPile(null);
        } else {
            return this;
        }
    }

    @Nullable
    @Override
    public Card get(int n) {
        if (n == 0 && this.card != null) {
            return this.card;
        } else {
            return null;
        }
    }

    @Override
    public int size() {
        if (this.card == null) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "OpenPile{" +
                "card=" + card +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OpenPile openPile = (OpenPile) o;
        return Objects.equals(card, openPile.card);
    }

    @Override
    public int hashCode() {
        return Objects.hash(card);
    }

}
