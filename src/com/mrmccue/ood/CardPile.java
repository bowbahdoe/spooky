package com.mrmccue.ood;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public interface CardPile {
    /**
     * Says whether or not the given card can be added to the pile
     *
     * @param card The card
     * @return Whether the card can be added to the pile
     */
    boolean canAdd(@Nonnull Card card);

    /**
     * Adds the card to the pile. If the card cannot be added to
     * the pile, this returns the pile unaltered.
     *
     * @param card The card to add.
     * @return The new pile with the card added.
     */
    @Nonnull
    CardPile add(@Nonnull Card card);

    /**
     * Removes the nth card in the pile. If the pile doesn't have an
     * nth card, returns the pile unaltered.
     *
     * @param n The number of the card to remove.
     * @return The changed pile
     */
    @Nonnull
    CardPile remove(int n);

    /**
     * Gets the nth card in the pile. Returns null if there is no card
     * in the specified position.
     *
     * @param n The number of the card to get.
     * @return The Card
     */
    @Nullable
    Card get(int n);

    /**
     * Gets the size of the pile.
     *
     * @return The size of the pile.
     */
    int size();

    /**
     * Gets the cards in the pile as an unmodifiable List.
     *
     * @return The list of the cards in the CardPile.
     */
    default List<Card> asList() {
        List<Card> cards = new ArrayList<>();
        for (int i = 0; i < this.size(); i++) {
            cards.add(this.get(i));
        }
        return Collections.unmodifiableList(cards);
    }

    /**
     * Moves the card at the given index in this pile to the given pile.
     * If such a move isn't possible, both piles are returned unchanged.
     *
     * @param atIndex The index of the card in this pile.
     * @param toPile  The pile to move the card to.
     * @return A pair with the first item being the new state of this pile and
     * the second item being the new state of the pile moved to.
     */
    default Pair<CardPile, CardPile> moveCard(int atIndex, @Nonnull CardPile toPile) {
        Objects.requireNonNull(toPile, "CardPile.moveCard: toPile must not be null");
        Card toMove = this.get(atIndex);
        if (toMove == null || !toPile.canAdd(toMove)) {
            return Pair.of(this, toPile);
        } else {
            CardPile movedFrom = this.remove(atIndex);
            CardPile movedTo = toPile.add(toMove);
            return Pair.of(movedFrom, movedTo);
        }
    }
}
