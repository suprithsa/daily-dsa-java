import java.util.List;

public class Appleandorange {
    public static void countApplesAndOranges(int s, int t, int a, int b,
                                         List<Integer> apples,
                                         List<Integer> oranges) {
    int appleCount = 0;
    int orangeCount = 0;

    // Count apples
    for (int d : apples) {
        int position = a + d;
        if (position >= s && position <= t) {
            appleCount++;
        }
    }

    // Count oranges
    for (int d : oranges) {
        int position = b + d;
        if (position >= s && position <= t) {
            orangeCount++;
        }
    }

    System.out.println(appleCount);
    System.out.println(orangeCount);
}
}
