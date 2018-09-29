package com.mrmccue.ood;

import javax.annotation.concurrent.Immutable;
import java.util.Objects;

/**
 * Value class representing a pair of items.
 *
 * @param <T> The type of the first item in the pair.
 * @param <R> The type of the second item in the pair.
 */
@Immutable
public final class Pair<T, R> {
    private final T first;
    private final R second;

    /**
     * Constructs a new pair.
     *
     * @param first  The first item for the pair.
     * @param second The second item for the pair.
     */
    private Pair(T first, R second) {
        this.first = first;
        this.second = second;
    }

    /**
     * Constructs a new Pair with the given items
     *
     * @param first  The first item for the new Pair.
     * @param second The second item for the new Pair.
     * @param <T>    The type of the first item.
     * @param <R>    The type of the second item.
     * @return The new Pair
     */
    public static <T, R> Pair<T, R> of(T first, R second) {
        return new Pair<>(first, second);
    }

    /**
     * Gets the first item in the pair.
     *
     * @return The first item in the pair
     */
    public T getFirst() {
        return this.first;
    }

    /**
     * Gets the second item in the pair.
     *
     * @return The second item in the pair.
     */
    public R getSecond() {
        return this.second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) &&
                Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
