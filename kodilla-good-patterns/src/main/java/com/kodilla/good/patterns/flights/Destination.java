package com.kodilla.good.patterns.flights;

public enum Destination {

    KRAKOW{
        @Override
        public String toString() {
            return "Krakow";
        }
    },
    WROCLAW{
        @Override
        public String toString() {
            return "Wroclaw";
        }
    },
    WARSAW{
        @Override
        public String toString() {
            return "Warsaw";
        }
    },
    GDANSK{
        @Override
        public String toString() {
            return "Gdansk";
        }
    },
    POZNAN{
        @Override
        public String toString() {
            return "Poznan";
        }
    };
}
