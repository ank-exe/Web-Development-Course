
public class prime2 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 100; i++) {
            int count = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;

            }
            if (count == 2)
                System.out.println(i);

        }
    }
}