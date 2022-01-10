package com.company;

public class PaintCan extends Paint {

    public static void main(String[] args) {
        PaintCan p = new PaintCan();
    }

    // Iterative solution
    public void fillBob(int x, int y) {
        while (!isFilled(x, y - 1)) {
            y = y - 1;
        }

        while (!isFilled(x, y)) {
            int x2 = x;
            while (!isFilled(x2, y)) {
                fillPixel(x2, y);
                x2++;
            }
            x2 = x - 1;

            while (!isFilled(x2, y)) {
                fillPixel(x2, y);
                x2--;
            }
            y++;
        }
    }

    // Recursive solution
    public void fillRec(int x, int y) {
        if (!isFilled(x, y)) {
            fillPixel(x, y);

            fillRec(x - 1, y);
            fillRec(x + 1, y);
            fillRec(x, y + 1);
            fillRec(x, y - 1);
        }
    }
}
