//print pattern using recursion
public class Practice6 {
    public static void main(String[] args) {
        printPat(4, 0);
        printPat2(4, 0);
    }

    static void printPat2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            printPat2(r, c + 1);
            System.out.print("*");
        } else {
            printPat2(r - 1, 0);
            System.out.println();
        }
    }

    static void printPat(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            printPat(r, c + 1);
        } else {
            System.out.println();
            printPat(r - 1, 0);
        }
    }
}
