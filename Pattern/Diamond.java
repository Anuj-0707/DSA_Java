package Pattern;

public class Diamond {
    public static void main(String[] args) {
        diamond(4);
    }
    static void diamond(int n) {

    // Upper half
    for (int i = 1; i <= n; i++) {

        for (int s = 1; s <= n - i; s++)
            System.out.print(" ");

        for (int j = 1; j <= i; j++)
            System.out.print("* ");

        System.out.println();
    }

    // Lower half
    for (int i = n - 1; i >= 1; i--) {

        for (int s = 1; s <= n - i; s++)
            System.out.print(" ");

        for (int j = 1; j <= i; j++)
            System.out.print("* ");

        System.out.println();
    }
}
}
