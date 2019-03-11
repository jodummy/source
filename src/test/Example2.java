public class Example2 {

    static int sum(int num) {
        if (num <= 1)
            return 1;
        return num + sum(num - 1);
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++)
            System.out.printf("%d %d\n", i, sum(i));
    }
}