public class Example1 {
    static int factori(int num) {
        if (num <= 1)
            return 1;

        return num * factori(num - 1);
    }

    public static void main(String[] args) {
        for (int i = 3; i <= 10; ++i)
            System.out.printf("%d %d\n", i, factori(i));
    }
}