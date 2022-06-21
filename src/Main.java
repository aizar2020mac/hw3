public class Main {

    public static void main(String[] args) {
        double numbers[] = {0, 5, -1, 4, 3, 2, -7, 4, 2, 6, -8, 3, 5, 5, -3, 8, 2, 43, -3, 55, 4, 8, -9, 3, 4, 8, -2, 1, 4, 4};
        double lol = 0;
        int haker = 0;
        boolean hook = false;
        for (double nabers : numbers) {
            if (nabers < 0) {
                hook = true;
            } else if (hook) {
                haker++;
                lol += nabers;

            }
        }
        System.out.println(lol / haker);
    }
}