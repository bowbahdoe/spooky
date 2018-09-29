package com.mrmccue.ood;

import cs3500.hw02.FreecellOperations;
import cs3500.hw02.PileType;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class FreecellGame implements FreecellOperations<Card> {
    private List<CardPile> cascadePiles;
    private List<CardPile> openPiles;
    private List<CardPile> foundationPiles;

    public FreecellGame() {
        this.cascadePiles = new ArrayList<>();
        this.openPiles = new ArrayList<>();
        this.foundationPiles = new ArrayList<>();
    }

    @Override
    public List<Card> getDeck() {
        List<Card> deck = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Value value : Value.values()) {
                deck.add(new Card(suit, value));
            }
        }
        return deck;
    }

    @Override
    public void startGame(List<Card> deck, int numCascadePiles, int numOpenPiles, boolean shuffle) throws IllegalArgumentException {
        if (deck == null) {
            throw new IllegalArgumentException("The deck must not be null");
        }
        if (!this.isValidDeck(deck)) {
            throw new IllegalArgumentException("The deck must be valid");
        }
        if (deck.contains(null)) {
            throw new IllegalArgumentException("No card in the deck should be null");
        }
        if (numCascadePiles < 4) {
            throw new IllegalArgumentException("The number of cascade piles should not be below 4.");
        }
        if (numOpenPiles < 1) {
            throw new IllegalArgumentException("The number of open piles should not be below 1");
        }

        this.openPiles = new ArrayList<>();
        this.foundationPiles = new ArrayList<>();
        this.cascadePiles = new ArrayList<>();

        for (int i = 0; i < numOpenPiles; i++) {
            this.openPiles.add(OpenPile.empty());
        }

        this.foundationPiles.add(FoundationPile.withSuit(Suit.CLUBS));
        this.foundationPiles.add(FoundationPile.withSuit(Suit.DIAMONDS));
        this.foundationPiles.add(FoundationPile.withSuit(Suit.SPADES));
        this.foundationPiles.add(FoundationPile.withSuit(Suit.HEARTS));

        List<Card> deckCopy = new ArrayList<>(deck);
        if (shuffle) {
            Collections.shuffle(deckCopy);
        }

        List<List<Card>> initialDeal = new ArrayList<>();
        for (int i = 0; i < numCascadePiles; i++) {
            initialDeal.add(new ArrayList<>());
        }
        for (int i = 0; i < deck.size(); i++) {
            initialDeal.get(i % numCascadePiles).add(deck.get(i));
        }

        for (List<Card> startingCards : initialDeal) {
            this.cascadePiles.add(CascadePile.withStartingCards(startingCards));
        }
    }

    /**
     * Determines whether the given deck is valid for playing Freecell.
     *
     * @param deck The deck to test.
     * @return Whether the deck is valid.
     */
    private boolean isValidDeck(List<Card> deck) {
        return deck != null
                && !deck.contains(null)
                && deck.size() == 52
                && deck.equals(deck.stream().distinct().collect(Collectors.toList()));
    }

    /**
     * Gets a mutable view of the specified pile. If there is no such pile,
     * returns null.
     *
     * @param pileType   The type of the pile
     * @param pileNumber The number of the pile, 1 indexed.
     * @return A MutableView over a pile.
     */
    @Nullable
    private MutableView<CardPile> getPile(@Nonnull PileType pileType, int pileNumber) {
        Objects.requireNonNull(pileType);

        int pileIndex = pileNumber - 1;

        List<CardPile> piles;
        switch (pileType) {
            case OPEN:
                piles = this.openPiles;
                break;
            case CASCADE:
                piles = this.cascadePiles;
                break;
            case FOUNDATION:
                piles = this.foundationPiles;
                break;
            default:
                throw new IllegalArgumentException("Unknown PileType");
        }

        if (pileIndex < 0 || pileIndex > piles.size() - 1) {
            return null;
        } else {
            return new MutableView<CardPile>() {
                @Override
                public CardPile get() {
                    return piles.get(pileIndex);
                }

                @Override
                public void set(CardPile cardPile) {
                    piles.set(pileIndex, cardPile);
                }
            };
        }
    }

    @Override
    public void move(PileType source, int pileNumber, int cardIndex, PileType destination, int destPileNumber) throws IllegalArgumentException {
        MutableView<CardPile> fromPileView = this.getPile(source, pileNumber);
        MutableView<CardPile> toPileView = this.getPile(destination, destPileNumber);

        if (fromPileView == null) {
            throw new IllegalArgumentException("There is no matching source pile");
        }

        if (toPileView == null) {
            throw new IllegalArgumentException("There is no matching destination pile");
        }

        CardPile fromPile = fromPileView.get();
        CardPile toPile = toPileView.get();

        Pair<CardPile, CardPile> moveResult = fromPile.moveCard(cardIndex, toPile);

        if (moveResult.equals(Pair.of(fromPile, toPile))) {
            throw new IllegalArgumentException("Move was not possible");
        }

        CardPile newFromPile = moveResult.getFirst();
        CardPile newToPile = moveResult.getSecond();

        fromPileView.set(newFromPile);
        toPileView.set(newToPile);
    }

    public boolean isGameOver() {
        return this.cascadePiles.isEmpty() && this.openPiles.isEmpty();
    }

    public String getGameState() {
        final StringBuilder sb = new StringBuilder();

        Function<List<Card>, String> joinCardsByCommas = cards -> cards
                .stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));

        for (int i = 0; i < this.foundationPiles.size(); i++) {
            sb.append("F");
            sb.append(Integer.toString(i + 1));

            List<Card> cards = this.foundationPiles.get(i).asList();
            if (cards.isEmpty()) {
                sb.append(":");
            } else {
                sb.append(": ");
            }

            sb.append(joinCardsByCommas.apply(cards));

            sb.append("\n");
        }

        for (int i = 0; i < this.openPiles.size(); i++) {
            sb.append("O");
            sb.append(Integer.toString(i + 1));

            List<Card> cards = this.openPiles.get(i).asList();
            if (cards.isEmpty()) {
                sb.append(":");
            } else {
                sb.append(": ");
            }

            sb.append(joinCardsByCommas.apply(cards));

            sb.append("\n");
        }

        for (int i = 0; i < this.cascadePiles.size(); i++) {
            sb.append("C");
            sb.append(Integer.toString(i + 1));

            List<Card> cards = this.cascadePiles.get(i).asList();
            if (cards.isEmpty()) {
                sb.append(":");
            } else {
                sb.append(": ");
            }

            sb.append(joinCardsByCommas.apply(cards));

            if (i != this.cascadePiles.size() - 1) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FreecellGame that = (FreecellGame) o;
        return Objects.equals(cascadePiles, that.cascadePiles) &&
                Objects.equals(openPiles, that.openPiles) &&
                Objects.equals(foundationPiles, that.foundationPiles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cascadePiles, openPiles, foundationPiles);
    }

    /**
     * Provides a mutable view into some larger structure.
     *
     * @param <T>
     */
    private interface MutableView<T> {
        /**
         * Gets the value stored in the cell.
         *
         * @return The value stored in the cell.
         */
        T get();

        /**
         * Sets the value in the cell.
         *
         * @param t The new value for the cell.
         */
        void set(T t);
    }
}
