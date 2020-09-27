package ru.mirea.lab7;

public class Bookshelf extends Furniture {
        private int amountOfBooks;
    private double width;
    private double height;
    private double length;

        public Bookshelf(double width, double height, double length, int amountOfBooks) {
            super(width, height, length);
            this.amountOfBooks = amountOfBooks;
        }

        public int getAmountOfBooks() {
            return amountOfBooks;
        }

        public void setAmountOfBooks(int amountOfBooks) {
            this.amountOfBooks = amountOfBooks;
        }

        @Override
        public String toString() {
            return "Bookshelf{" +
                    "width=" + width +
                    ", height=" + height +
                    ", length=" + length +
                    ", amountOfBooks=" + amountOfBooks +
                    '}';
        }
}

