package com.mrmccue.ood;

public enum Suit {
    CLUBS {
        @Override
        public String toString() {
            return "♣";
        }
    },
    SPADES {
        @Override
        public String toString() {
            return "♠";
        }
    },
    DIAMONDS {
        @Override
        public String toString() {
            return "♥";
        }
    },
    HEARTS {
        @Override
        public String toString() {
            return "♦";
        }
    }
}
