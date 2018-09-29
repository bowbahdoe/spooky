package com.mrmccue.ood;

import java.util.function.Function;

public class LenseExample {
    private interface Lens<OnType, Viewing> {
        /**
         * Gets the value pointed at by the Lens
         * @return The value pointed at by the lens
         */
        Viewing get();

        /**
         * Sets the value pointed at by the lens
         * @param t The new value for the field being viewed
         * @return A new instance of the type being viewed with the given value
         * set.
         */
        OnType set(Viewing t);

        /**
         * Applies the given function to the value being viewed.
         * @param f The function to apply
         * @return A new instance of the type being viewed with the updated value.
         */
        default OnType update(Function<Viewing, Viewing> f) {
            return this.set(f.apply(this.get()));
        }
    }

    private class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

        public Lens<Point, Integer> viewX() {
            Point self = this;
            return new Lens<Point, Integer>() {
                @Override
                public Integer get() {
                    return self.getX();
                }

                @Override
                public Point set(Integer newX) {
                    return new Point(
                            newX,
                            self.getY()
                    );
                }
            };
        }

        public Lens<Point, Integer> viewY() {
            Point self = this;
            return new Lens<Point, Integer>() {
                @Override
                public Integer get() {
                    return self.getY();
                }

                @Override
                public Point set(Integer newY) {
                    return new Point(
                            self.getX(),
                            newY
                    );
                }
            };
        }
    }
}
