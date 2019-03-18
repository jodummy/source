import java.util.Scanner;

public class sadsadsa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = 0, b = 0;
        String operator;

        System.out.println("연산 >>");
        a = input.nextDouble();
        operator = input.nextLine();
        b = input.nextDouble();

        System.out.println(a + " " + operator + " " + b + " 의 연산결과 : ");

        switch (operator) {
        case "+":
            System.out.println(a + b);
            break;
        case "-":
            System.out.println(a - b);
            break;
        case "*":
            System.out.println(a * b);
            break;
        case "/":
            if (b == 0) {
                System.out.println("0 으로는 나눌 수 없습니다.");
            } else {
                System.out.print(a / b);
            }
            break;
        default:
            System.out.print("error \n 알 수 없는 연산자");
        }
    }

}