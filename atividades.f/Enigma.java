public class Enigma {
    public static void main(String[] args) {
        int y = 0, x;
        while (y != 6) {
            y++;
            if (y > 0) {
                System.out.printf("%d ", y);
            } else {
                x = -1*y;
                System.out.printf("%d ", x);
            }
        }
    }
}