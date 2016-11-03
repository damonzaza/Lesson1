/**
 * Написати програму, яка запитатиме користувача ввести два цілих числа і виконає над ними операції з 4 завдання.
 * Created by Dmytro Zamosenchuk on 31/10/2016.
 */
import java.util.Scanner;

import static java.lang.System.in;

public class Task5 {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        double Result=0;
        System.out.println("This is calculator");
        Scanner in = new Scanner(System.in);
        System.out.print("Input first integer ");
        a = in.nextInt();
        System.out.print("Input second integer ");
        b = in.nextInt();
        System.out.println("Sum is "+ (a+b));
        System.out.println("Sum is "+ (a-b));
        System.out.println("Sum is "+ (a*b));
        System.out.println("Sum is "+ (a/b));
        System.out.println("Sum is "+ (a%b));
    }
}
